package com.littleworld.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String address;
    double lat;
    double lng;
    boolean draggable;

    public Marker() {}
    public Marker(int id, String address, double lat, double lng, boolean draggable) {
        this.id = id;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.draggable = draggable;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getLng() { return lng; }
    public void setLng(double lng) { this.lng = lng; }

    public boolean isDraggable() { return draggable; }
    public void setDraggable(boolean draggable) { this.draggable = draggable; }
}