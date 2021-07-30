package com.vs.roomservices;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomWebServices {
    private final RoomRepository repository;

    @GetMapping
    public Iterable<Room> getAllReservations() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Room getReservation(@PathVariable long id) {
        return repository.findById(id).get();
    }
}
