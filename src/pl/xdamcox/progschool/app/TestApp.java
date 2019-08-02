package pl.xdamcox.progschool.app;

import pl.xdamcox.progschool.dao.UserDAO;
import pl.xdamcox.progschool.model.User;
import pl.xdamcox.progschool.util.DBUtil;

import java.sql.SQLException;
import java.util.Arrays;

public class TestApp {

    public static void main(String[] args) throws SQLException {
//        testConnect();
//        createUser();
//        testReadUser();
//        testUpdateUser();
//        testDeleteUser();
//        testFIndAll();
    }

    private static void testFIndAll() {
        UserDAO userDAO = new UserDAO();

        User user1 = new User("test1123", "test1231", "test1321");
        User user2 = new User("test20", "test231", "test213");
        User user3 = new User("test33", "test32", "test3321");

        userDAO.create(user1);
        userDAO.create(user2);
        userDAO.create(user3);

        User[] allUsers = userDAO.findAll();

        System.out.println(Arrays.toString(allUsers));
    }

    private static void testDeleteUser() {
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read(1);

        userDAO.delete(user.getId());

        User userAfterDelete = userDAO.read(user.getId());
        System.out.println(userAfterDelete);
    }

    private static void testUpdateUser() {
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read(1);
        user.setUsername("newusername");

        userDAO.update(user);

        User userAfterUpdate = userDAO.read(1);
        System.out.println(user);
        System.out.println(userAfterUpdate);
    }

    private static void testReadUser() {
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read(1);
        System.out.println(user);

        User user2 = userDAO.read(101);
        System.out.println(user2);
    }

    private static void testConnect() throws SQLException {
        DBUtil.connect();
    }
    private static void createUser(){
        User user = new User("test2@test2.pl", "test2", "test2");
        System.out.println(user);

        UserDAO userDAO = new UserDAO();
        user = userDAO.create(user);

        System.out.println(user);
    }
}
