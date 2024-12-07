package org.example.database_project.repository;

import com.example.database_project.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Instructor c WHERE c.id = ?1")
    boolean isIdExist(Long id);
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Instructor c WHERE c.email = ?1")
    boolean isEmailExist(String email);
    @Query("SELECT c FROM Category c WHERE c.id = ?1")
    Optional<Instructor> findById(Long id);
    @Query("SELECT c FROM Category c WHERE c.name = ?1")
    Optional<Instructor> findByName(String name);
}
