package com.m2dl.nuitinfo2016.model.poi;

import com.m2dl.nuitinfo2016.model.service.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
public abstract class POI {

    @NotNull
    private String name;
    private String description;
    private String address;

    private Collection<Service> services = new ArrayList<Service>();

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

