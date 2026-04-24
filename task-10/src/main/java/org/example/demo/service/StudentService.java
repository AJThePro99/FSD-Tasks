package org.example.demo.service;

import jakarta.transaction.Transactional;
import org.example.demo.entity.Student;
import org.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getById(Long id);
    Student create(Student student);
    Student update(Long id, Student student);
    void delete(Long id);
}
