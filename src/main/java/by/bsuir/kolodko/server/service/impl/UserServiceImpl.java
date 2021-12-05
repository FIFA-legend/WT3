package by.bsuir.kolodko.server.service.impl;

import by.bsuir.kolodko.server.dao.DaoFactory;
import by.bsuir.kolodko.server.dao.UserDao;
import by.bsuir.kolodko.server.entity.User;
import by.bsuir.kolodko.server.exeptions.DaoException;
import by.bsuir.kolodko.server.exeptions.ServiceException;
import by.bsuir.kolodko.server.service.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> login(String login, String password) throws ServiceException {
        if (login == null || password == null) {
            return Optional.empty();
        }

        try {
            UserDao userDao = DaoFactory.newInstance().getUserDao();
            return userDao.findByLoginAndPassword(login, password);
        } catch (DaoException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

}
