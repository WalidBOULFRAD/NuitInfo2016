package com.m2dl.nuitinfo2016.initialisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by A.Anass on 02/12/2016.
 */
@Service
public class BootStrap {

    @Autowired
    private Initialisation initialisation;

    @PostConstruct
    void init() {
        try {
            initialisation.initAdministration();
            initialisation.initAssociation();
            initialisation.initIndividual();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
