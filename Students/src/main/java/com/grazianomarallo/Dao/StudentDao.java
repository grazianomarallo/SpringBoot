package com.grazianomarallo.Dao;

import com.grazianomarallo.Entity.Student;

import java.util.Collection;

/**
 * @author grazianomarallo
 * @project: Students
 * @package: com.grazianomarallo.Dao
 * @date: 10/03/2020
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDB(Student student);
}
