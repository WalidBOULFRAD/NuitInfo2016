package com.m2dl.nuitinfo2016.model.service;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.m2dl.nuitinfo2016.model.actor.Administration;
import com.m2dl.nuitinfo2016.model.actor.Association;
import com.m2dl.nuitinfo2016.model.actor.Individual;
import com.m2dl.nuitinfo2016.model.poi.POI;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @JsonSubTypes.Type(value = Administratif.class, name = "Administratif"),
        @JsonSubTypes.Type(value = Alimentaire.class, name = "Alimentaire"),
        @JsonSubTypes.Type(value = Hebergement.class, name = "Hebergement"),
        @JsonSubTypes.Type(value = Medical.class, name = "Medical"),
        @JsonSubTypes.Type(value = Sanitaire.class, name = "Sanitaire")})
@Entity
public abstract class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull @NotBlank
    protected String description;

    @NotNull
    @ManyToOne(fetch= FetchType.LAZY)
    private POI poi;

    public POI getPoi() {
        return poi;
    }

    public void setPoi(POI poi) {
        this.poi = poi;
    }
}
