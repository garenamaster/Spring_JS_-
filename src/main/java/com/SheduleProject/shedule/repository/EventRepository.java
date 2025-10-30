package com.SheduleProject.shedule.repository;

import com.SheduleProject.shedule.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDate(LocalDate date);
}
