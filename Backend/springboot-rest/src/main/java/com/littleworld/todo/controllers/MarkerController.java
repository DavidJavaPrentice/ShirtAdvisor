package com.littleworld.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.littleworld.todo.model.Marker;
import com.littleworld.todo.services.MarkerService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class MarkerController {
    @Autowired  private MarkerService markerService;

    @ResponseBody
    @RequestMapping(value = "/marker", method = RequestMethod.POST)
    public int create(@RequestBody Marker marker) {
        return markerService.save(marker).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/marker", method = RequestMethod.GET)
    public List<Marker> findAll() {
        return (List<Marker>)markerService.findAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/marker/{id}", method = RequestMethod.DELETE)
    public void updateMarker(@PathVariable  int id) {
        markerService.deleteById(id);
    }

}