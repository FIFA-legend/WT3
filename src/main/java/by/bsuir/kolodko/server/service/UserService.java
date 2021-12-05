package by.bsuir.kolodko.server.service;

import by.bsuir.kolodko.server.entity.User;
import by.bsuir.kolodko.server.exeptions.ServiceException;

import java.util.Optional;

public interface UserService {

    Optional<User> login(String login, String password) throws ServiceException;

}
