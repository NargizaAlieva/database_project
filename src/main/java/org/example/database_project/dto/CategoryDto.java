package org.example.database_project.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public CategoryDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
