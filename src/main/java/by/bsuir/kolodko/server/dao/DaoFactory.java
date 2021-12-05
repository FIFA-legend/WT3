package by.bsuir.kolodko.server.dao;

import by.bsuir.kolodko.server.dao.impl.StudentDaoImpl;
import by.bsuir.kolodko.server.dao.impl.UserDaoImpl;

public class DaoFactory {

    private static volatile DaoFactory INSTANCE;

    private final UserDao userDao = new UserDaoImpl();

    private final StudentDao studentDao = new StudentDaoImpl();

    private DaoFactory() {
    }

    public static DaoFactory newInstance() {
        if (INSTANCE == null) {
            synchronized (DaoFactory.class) {
                if (INSTANCE == null) INSTANCE = new DaoFactory();
            }
        }
        return INSTANCE;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
}
