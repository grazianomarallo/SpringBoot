package com.grazianomarallo.Service;

import com.grazianomarallo.Dao.StudentDao;
import com.grazianomarallo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author grazianomarallo
 * @project: Students
 * @package: com.grazianomarallo.Service
 * @date: 10/03/2020
 */
@Service
public class StudentService {
    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;


    public Collection<Student> getAllStudents(){
        return  studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDB(student);
    }
}
