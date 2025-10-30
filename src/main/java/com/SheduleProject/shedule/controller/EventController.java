package com.SheduleProject.shedule.controller;

import com.SheduleProject.shedule.repository.EventRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import com.SheduleProject.shedule.entity.Event;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/date")
    public List<Event> getByDate(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return repository.findByDate(date);
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return repository.findAll();
    }
}