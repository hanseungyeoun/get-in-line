package com.uno.getinline.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ApiEventController {

    @GetMapping("/events")
    public List<String> getEvents() {
        return List.of("event1", "event2");
    }

    @PostMapping("/events")
    public Boolean createEvent() {
        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {
        return "event" + eventId;
    }

    @PutMapping("/events/{eventId}")
    public String modifyEvent(
            @PathVariable Long eventId
    ) {
        return "event" + eventId;
    }

    @DeleteMapping("/events/{eventId}")
    public String removeEvent(@PathVariable Long eventId) {
        return "event" + eventId;
    }
}
