package kg.itschool.airtickets.dao.impl;

import kg.itschool.airtickets.dao.PassengerRepository;
import kg.itschool.airtickets.entity.Passenger;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@NoArgsConstructor
public class PassengerRepositoryImpl implements PassengerRepository {

    {
        sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Passenger.class)
                .buildSessionFactory();
    }

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Passenger passenger) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(passenger);
        session.close();
    }

    @Override
    public void getAllPassengers() {
        Session session = sessionFactory.getCurrentSession();

    }

    @Override
    public void deletePassenger(Long id) {

    }

    @Override
    public void updatePassenger(Passenger passenger) {

    }
}
