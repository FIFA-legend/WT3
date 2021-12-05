package by.bsuir.kolodko.server.dao;

import by.bsuir.kolodko.server.entity.User;
import by.bsuir.kolodko.server.exeptions.DaoException;

import java.util.Optional;

public interface UserDao {

    Optional<User> findByLoginAndPassword(String login, String password) throws DaoException;

}
