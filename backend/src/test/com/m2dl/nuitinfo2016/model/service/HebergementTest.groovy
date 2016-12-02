package com.m2dl.nuitinfo2016.model.service
/**
 * Created by Moghite on 02/12/2016.
 */
import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

class HebergementTest extends Specification {

    Validator validator

    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'un service de type hebergement #unDescriptif"(String unDescriptif, int nbrPlaceAvailable) {

        given: "initialisation d'un service alimentaire"
        Hebergement hebergement = new Hebergement(description: unDescriptif, placesAvailable: nbrPlaceAvailable)

        expect: "le service est valide"
        validator.validate(hebergement).empty

        where:
        unDescriptif | nbrPlaceAvailable
        "chambre"    | 1

    }

    @Unroll
    void "test l'invalidite d'un service de type hebergement #unDescriptif"(String unDescriptif, int nbrPlaceAvailable) {

        given: "initialisation d'un service alimentaire"
        Hebergement hebergement = new Hebergement(description: unDescriptif, placesAvailable: nbrPlaceAvailable)

        expect: "le service est valide"
        !validator.validate(hebergement).empty

        where:
        unDescriptif | nbrPlaceAvailable
        "chambre"    | -5
        null         | 5
        ""           | 5

    }
}
