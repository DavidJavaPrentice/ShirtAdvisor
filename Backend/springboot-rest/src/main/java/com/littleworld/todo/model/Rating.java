package com.littleworld.todo.model;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int rating;
    private String review;
    private String photo;

    @ManyToOne
    private User user;

    @ManyToOne
    private Marker marker;

    public Rating() {}

    public Rating(int id, int rating, String review, String photo, User user, Marker marker) {
        this.id = id;
        this.rating = rating;
        this.review = review;
        this.photo = photo;
        this.user = user;
        this.marker = marker;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Marker getMarker() { return marker; }
    public void setMarker(Marker marker) { this.marker = marker; }
}