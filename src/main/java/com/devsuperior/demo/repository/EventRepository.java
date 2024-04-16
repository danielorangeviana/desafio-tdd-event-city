package com.devsuperior.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
