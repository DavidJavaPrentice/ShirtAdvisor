package com.littleworld.todo.controllers;

import com.littleworld.todo.model.Rating;
import com.littleworld.todo.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class RatingController {

    @Autowired  private RatingService ratingService;

    //curl -H "Content-Type: application/json" -X POST -d '{"id": 0, "task", "description","date": "taskTest"}' http://localhost:8080/rate
    @ResponseBody
    @RequestMapping(value = "/rating", method = RequestMethod.POST)
    public int create(@RequestBody Rating rating) {
        return ratingService.save(rating).getId();
    }

    //curl -H "Content-Type: application/json" -X PUT -d '{"id": 1, "task", "description","date": "taskTest"}' http://localhost:8080/rate/1
    @ResponseBody
    @RequestMapping(value = "/rating/{id}", method = RequestMethod.PUT)
    public int updateRate(@PathVariable  int id, @RequestBody Rating rating) {
        return ratingService.save(rating).getId();
    }

    //curl -X DELETE http://localhost:8080/rating/1
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/rating/{id}", method = RequestMethod.DELETE)
    public void updateRate(@PathVariable  int id) {
        ratingService.deleteById(id);
    }

    //curl  http://localhost:8080/rating
    @ResponseBody
    @RequestMapping(value = "/rating", method = RequestMethod.GET)
    public List<Rating> findAll() {
        return (List<Rating>)ratingService.findAll();
    }


    //curl  http://localhost:8080/rating/1
    @ResponseBody
    @RequestMapping(value = "/rating/{id}", method = RequestMethod.GET)
    public Optional<Rating> rateById(@PathVariable  int id) {
        return ratingService.findById(id);
    }

    @RequestMapping(value = "/page3", method = RequestMethod.GET)
    public String page() {
        return "rating";
    }

    @ResponseBody
    @RequestMapping(value = "/historyQry", method = RequestMethod.GET)
    public List<Rating> getAllRatingsByUserId(@RequestParam(value="user") int id) {
        return ratingService.findByUseridNativeQuery(id);
    }
    @ResponseBody
    @RequestMapping(value = "/average/{id}", method = RequestMethod.GET)
    public Double averageStarsQuery (@PathVariable int id) {
        List <Rating> ratings = ratingService.findByMarkerId(id);
        double som = 0;
        for (Rating rating: ratings) {
            System.out.println(" " + rating.getMarker().getId() + " " + rating.getRating());
            som += rating.getRating();
        }
        if (ratings.size() == 0){
            return 0.0;
        }else {
            return som/ratings.size();
        }


    }
}