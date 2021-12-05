package by.bsuir.kolodko.server.dao;

import by.bsuir.kolodko.server.entity.Student;
import by.bsuir.kolodko.server.exeptions.DaoException;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    List<Student> findAll() throws DaoException;

    List<Student> findAllBySpeciality(String gradeBookNumber) throws DaoException;

    Optional<Student> findByGradeBookNumber(String gradeBookNumber) throws DaoException;

    void saveStudent(Student student) throws DaoException;

    void updateStudentByGradeBookNumber(String gradeBookNumber, Student student) throws DaoException;

}
