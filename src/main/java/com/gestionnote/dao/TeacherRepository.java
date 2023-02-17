package com.gestionnote.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionnote.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
