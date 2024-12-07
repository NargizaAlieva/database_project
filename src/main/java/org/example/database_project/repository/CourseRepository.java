package org.example.database_project.repository;

import com.example.database_project.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Course c WHERE c.id = ?1")
    boolean isIdExist(Long id);
    @Query("SELECT c FROM Category c WHERE c.id = ?1")
    Optional<Course> findById(Long id);
    @Query("SELECT c FROM Course c WHERE c.title LIKE %?1%")
    List<Course> findByNameContains(String title);
}
