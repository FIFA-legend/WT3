package by.bsuir.kolodko.connection;

public enum MessageType {
    SELECT_ALL_STUDENTS_INFO,
    SELECT_STUDENTS_INFO_BY_SPECIALITY,
    SELECT_STUDENT_INFO_BY_GRADE_BOOK_NUMBER,
    SAVE_STUDENT_INFO,
    UPDATE_STUDENT_INFO_BY_GRADE_BOOK_NUMBER,
    LOGIN,
    DISCONNECT_FROM_SERVER,
    LOGIN_ERROR,
    LOGIN_SUCCESS,
    SELECT_ALL_STUDENTS_INFO_SUCCESS,
    SELECT_STUDENTS_INFO_BY_SPECIALITY_SUCCESS,
    SELECT_STUDENT_INFO_BY_GRADE_BOOK_NUMBER_SUCCESS,
    SAVE_STUDENT_INFO_SUCCESS,
    UPDATE_STUDENT_INFO_BY_GRADE_BOOK_NUMBER_SUCCESS,
    SELECT_STUDENT_INFO_BY_GRADE_NUMBER_ERROR,
    SAVE_STUDENT_INFO_ERROR,
    UPDATE_STUDENT_INFO_BY_GRADE_BOOK_NUMBER_ERROR
}
