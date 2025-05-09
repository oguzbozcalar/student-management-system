package com.ogzbzclr.sms.repository;

import com.ogzbzclr.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
