package org.example.database_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "instructor")
@Getter
@Setter
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "bio")
    private String bio;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @PrePersist
    private void prePersist() {
        registrationDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public Instructor setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Instructor setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Instructor setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getBio() {
        return bio;
    }

    public Instructor setBio(String bio) {
        this.bio = bio;
        return this;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Instructor setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }
}
