package com.ogzbzclr.sms.service;

import com.ogzbzclr.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getUserById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
