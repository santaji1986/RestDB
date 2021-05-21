package org.san.restdb.service;

import java.util.List;
import java.util.Optional;

import org.san.restdb.dao.StudentRepository;
import org.san.restdb.dto.AddStudentRequest;
import org.san.restdb.dto.UpdateStudentRequest;
import org.san.restdb.exceptions.DataNotFoundException;
import org.san.restdb.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public void updateStudent(UpdateStudentRequest student) throws DataNotFoundException {
        final Optional<Student> studentToUpdate = studentRepository.findById(student.getRollId());
        if (!studentToUpdate.isPresent()) {
            throw new DataNotFoundException("User is not found");
        }
        final Student existingStudent = studentToUpdate.get();

        // Updating entity in transactional context. No need to call save method
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        // existingUser.setCity(updateUserInfo.getCity());
        studentRepository.save(existingStudent);
    }

    @Override
    public void addStudent(AddStudentRequest student) {
        final Student studentToAdd = new Student();
        studentToAdd.setFirstName(student.getFirstName());
        studentToAdd.setLastName(student.getLastName());
        // userToAdd.setCity(userInfo.getCity());
        studentRepository.save(studentToAdd);
    }

    @Override
    public List<Student> getAllStudents() {
        final List<Student> students = studentRepository.findAll();
        return students;
    }
}
