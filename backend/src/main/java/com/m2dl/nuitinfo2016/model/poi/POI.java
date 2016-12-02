package com.m2dl.nuitinfo2016.model.poi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.m2dl.nuitinfo2016.model.actor.Actor;
import com.m2dl.nuitinfo2016.model.service.Service;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public abstract class POI {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String description;

    @NotNull
    @NotBlank
    private String address;

    @OneToMany(mappedBy = "poi")
    private Collection<Service> services;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Actor owner;

    @NotNull
    private Float lat;

    @NotNull
    private Float lon;

    public POI() {
        this.services = new ArrayList<Service>();
    }

    public POI(String name, String description, String address, Actor owner, Float lat, Float lon) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.owner = owner;
        this.lat = lat;
        this.lon = lon;
        this.services = new ArrayList<Service>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setServices(Collection<Service> services) {
        this.services = services;
    }

    public Actor getOwner() {
        return owner;
    }

    public void setOwner(Actor owner) {
        this.owner = owner;
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

