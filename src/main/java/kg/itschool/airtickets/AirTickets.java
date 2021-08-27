//package kg.itschool.airtickets;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class AirTickets extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String user = "postgres";
//        String password = "1234";
//        String driver = "org.postgresql.Driver";
//        String url = "jdbc:postgres://localhost:5432//test";
//
//        try {
//            Class.forName(driver);
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
