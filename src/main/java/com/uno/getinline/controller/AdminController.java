package com.uno.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public String adminPlaces(){
        return "admin/places";
    }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId) {
        return "admin/places";
    }

    @GetMapping("/events")
    public String events() {
        return "admin/events";
    }

    @GetMapping("/events/{eventId}}")
    public String event(@PathVariable Integer eventId) {
        return "admin/event/detail";
    }
}
