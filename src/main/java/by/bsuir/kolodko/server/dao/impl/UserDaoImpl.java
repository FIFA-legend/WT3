package by.bsuir.kolodko.server.dao.impl;

import by.bsuir.kolodko.server.dao.parser.ParserFactory;
import by.bsuir.kolodko.server.dao.UserDao;
import by.bsuir.kolodko.server.entity.User;
import by.bsuir.kolodko.server.exeptions.DaoException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    private final String USERS_FILE_PATH = "src\\main\\resources\\Users.xml";

    @Override
    public Optional<User> findByLoginAndPassword(String login, String password) throws DaoException {
        try {
            return ParserFactory.newInstance().getUserParser().takeUser(USERS_FILE_PATH, login, password);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new DaoException(e.getMessage(), e);
        }
    }

}
