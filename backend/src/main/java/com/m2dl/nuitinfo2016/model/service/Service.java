package com.m2dl.nuitinfo2016.model.service;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
public abstract class Service {
    @NotNull @NotBlank
    protected String description;
}
