package com.m2dl.nuitinfo2016.util;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
public class Point {

    private Float lat;

    private Float lon;


    public Point() {

    }

    public Point(Float lat, Float lon) {
        this.lat = lat;
        this.lon = lon;
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

}
