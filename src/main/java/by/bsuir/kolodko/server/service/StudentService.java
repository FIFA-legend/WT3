package by.bsuir.kolodko.server.service;

import by.bsuir.kolodko.server.entity.Student;
import by.bsuir.kolodko.server.exeptions.ServiceException;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll() throws ServiceException;

    List<Student> findAllBySpeciality(String speciality) throws ServiceException;

    Optional<Student> findByGradeBookNumber(String gradeBookNumber) throws ServiceException;

    boolean saveStudent(String name, String surname, String gradeBookNumber, String speciality, String gender, String stringBirthday) throws ServiceException;

    boolean updateStudentByGradeBookNumber(String gradeBookNumberToSearch, String name, String surname, String gradeBookNumber, String speciality, String gender, String stringBirthday) throws ServiceException;

}
