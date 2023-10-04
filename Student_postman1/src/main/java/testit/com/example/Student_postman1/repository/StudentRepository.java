package testit.com.example.Student_postman1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testit.com.example.Student_postman1.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
