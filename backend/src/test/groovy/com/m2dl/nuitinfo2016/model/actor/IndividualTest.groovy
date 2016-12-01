package com.m2dl.nuitinfo2016.model.actor

import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validator
import javax.validation.ValidatorFactory

/**
 * Created by A.Anass on 01/12/2016.
 */
class IndividualTest extends Specification {
    Validator validator
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'un individual"(String unName, String uneAddress,
                            String unPhoneNumber, String unMail,String uneIcon) {

        given: "un individual initialise avec un name, address, phoneNumber, mail et icon qui sont non vide"
        Individual individual = new Individual(name: unName, address: uneAddress, phoneNumber: unPhoneNumber,
                mail: unMail, icon: uneIcon)

        expect: "l'individual est valide"
        validator.validate(individual).empty

        where:                   "0613436545"
        unName     | uneAddress | unPhoneNumber   | unMail      | uneIcon
        "un nom 1" | "uneaddress" | "0614129810"  | "ml@ml.com" | "une icon"
    }

    @Unroll
    void "test l'invalidite d'un individual non valide"(String unName, String uneAddress,
                            String unPhoneNumber, String unMail,String uneIcon) {

        given: "un individual initialise de maniere non valide"
        Individual individual = new Individual(name: unName, address: uneAddress, phoneNumber: unPhoneNumber,
                mail: unMail, icon: uneIcon)

        expect: "l'individual est invalide"
        !validator.validate(activite).empty

        where:
        unName  | uneAddress  | unPhoneNumber   | unMail      | uneIcon
        null    | null        | null            | null        | null
        null    | null        | null            | null        | "une icon"
        null    | null        | null            | "ml@ml.com" | "une icon"
        null    | null        | "0537981539"    | "ml@ml.com" | "une icon"
        null    | "uneaddress" | "0537981539"   | "ml@ml.com" | "une icon"
        ""      | ""          | ""              | ""          | ""
        ""      | ""          | ""              | ""          | "une icon"
        ""      | ""          | ""              | "ml@ml.com" | "une icon"
        ""      | ""          | "0537981539"    | "ml@ml.com" | "une icon"
        ""      | "uneaddress" | "0537981539"   | "ml@ml.com" | "une icon"
        "un name 1" | "une address" | "0537981539" | "ml"     | "une icon"
        "un name 1" | "une address" | "0537981539" | "ml.com" | "une icon"

    }

}

