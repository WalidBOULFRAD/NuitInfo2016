package com.m2dl.nuitinfo2016.model.poi;

import com.m2dl.nuitinfo2016.model.actor.Actor;
import com.m2dl.nuitinfo2016.model.service.Service;
import com.m2dl.nuitinfo2016.util.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
public abstract class POI {

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String address;

    @OneToMany(mappedBy = "poi")
    private Collection<Service> services = new ArrayList<Service>();

    @NotNull
    @ManyToOne(fetch= FetchType.LAZY)
    private Actor owner;

    @OneToOne
    private Point location;

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

}

