package org.san.restdb.service;

import java.util.List;

import org.san.restdb.dto.AddStudentRequest;
import org.san.restdb.dto.UpdateStudentRequest;
import org.san.restdb.exceptions.DataNotFoundException;
import org.san.restdb.models.Student;

public interface StudentService {
    void addStudent(AddStudentRequest user);

    void updateStudent(UpdateStudentRequest user) throws DataNotFoundException;

    List<Student> getAllStudents();
}
