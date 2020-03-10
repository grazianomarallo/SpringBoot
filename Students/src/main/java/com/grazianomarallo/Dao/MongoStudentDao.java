package com.grazianomarallo.Dao;

import com.grazianomarallo.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author grazianomarallo
 * @project: Students
 * @package: com.grazianomarallo.Dao
 * @date: 10/03/2020
 */
@Repository
@Qualifier("mongoData")
public class MongoStudentDao implements StudentDao {

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Nick", "Nothing"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDB(Student student) {

    }
}
