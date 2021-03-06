package com.rs.eis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.eis.model.Qualification;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification, Integer> {

}
