package kg.itschool.airtickets.dao.impl;

import kg.itschool.airtickets.dao.PlaneRepository;
import kg.itschool.airtickets.entity.Plane;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.hibernate.cfg.Configuration;

import javax.transaction.Transactional;

@Repository
@NoArgsConstructor
public class PlaneRepositoryImpl implements PlaneRepository {
    private SessionFactory sessionFactory;
    {
        sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Plane.class)
                .buildSessionFactory();
    }


    @Override
    @Transactional
    public void insertPlane(Plane plane) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(plane);
        session.close();
    }

}
