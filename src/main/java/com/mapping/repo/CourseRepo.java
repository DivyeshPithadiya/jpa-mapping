package com.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.models.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
