package com.mateus.matchmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.matchmanager.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
