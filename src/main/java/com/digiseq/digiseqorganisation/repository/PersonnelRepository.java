package com.digiseq.digiseqorganisation.repository;

import com.digiseq.digiseqorganisation.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends JpaRepository <Personnel, Long> {
}