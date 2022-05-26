package com.uno.getinline.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ApiPlaceController {

    @PostMapping("/places")
    List<String> getPlaces(){
        return List.of("place1", "place2");
    }

    @GetMapping("/places")
    Boolean createPlace(){
        return true;
    }

    @GetMapping("/places/{placeId}")
    public String getPlace(
            @PathVariable Integer placeId
    ) {
        return "place" + placeId;
    }


    @PutMapping("/places/{placeId}")
    public String modifyPlace(
            @PathVariable Integer placeId
    ) {
        return "place" + placeId;
    }

    @DeleteMapping("/places/{placeId}")
    public String removePlace(
            @PathVariable Integer placeId
    ) {
        return "place" + placeId;
    }

}
