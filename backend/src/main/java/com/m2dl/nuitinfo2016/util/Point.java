package com.m2dl.nuitinfo2016.util;

import com.m2dl.nuitinfo2016.model.poi.POI;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Point {

    @Id
    private Long id;

    private Float lat;

    private Float lon;

    @OneToOne
    private POI poi;

    public Point() {
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public POI getPoi() {
        return poi;
    }

    public void setPoi(POI poi) {
        this.poi = poi;
    }
}
