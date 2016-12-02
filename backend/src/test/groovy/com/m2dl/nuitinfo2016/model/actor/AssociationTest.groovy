package groovy.com.m2dl.nuitinfo2016.model.actor

import com.m2dl.nuitinfo2016.model.actor.Association
import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

/**
 * Created by A.Anass on 02/12/2016.
 */
class AssociationTest extends Specification {

    Validator validator

    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'une association"(String unName, String uneAddress, String unPhoneNumber,
                                              String unMail, boolean unValide, String unSiret) {

        given: "une association initialise correctement"
        Association association = new Association(name: unName, address: uneAddress, phoneNumber: unPhoneNumber,
                mail: unMail, valide: unValide, siret: unSiret)

        expect: "l'association est valide"
        validator.validate(association).empty

        where:
        unName     | uneAddress | unPhoneNumber   | unMail      | unValide  | unSiret
        "un nom 1" | "uneaddress" | "0614129810"  | "ml@ml.com" | true      | "101061648941313274"
        "un nom 2" | "uneaddress" | "0124646589"  | "ml@ml.com" | false     | "101061648941313274"
    }

    @Unroll
    void "test l'invalidite d'une association non valide"(String unName, String uneAddress, String unPhoneNumber,
                                                          String unMail, boolean unValide, String unSiret) {

        given: "une association initialise de maniere non valide"
        Association association = new Association(name: unName, address: uneAddress, phoneNumber: unPhoneNumber,
                mail: unMail, valide: unValide, siret: unSiret)

        expect: "l'association est invalide"
        !validator.validate(association).empty

        where:
        unName  | uneAddress  | unPhoneNumber   | unMail      | unValide  | unSiret
        null    | null        | null            | null        | null      | null
        null    | null        | null            | null        | null      | "12132023060"
        null    | null        | null            | null        | true      | "12132023060"
        null    | null        | null            | "ml@ml.com" | true      | "12132023060"
        null    | null        | "0537981539"    | "ml@ml.com" | true      | "12132023060"
        null    | "uneaddress" | "0537981539"   | "ml@ml.com" | true      | "12132023060"
        ""      | ""          | ""              | ""          | true      | ""
        ""      | ""          | ""              | ""          | true      | "12132023060"
        ""      | ""          | ""              | "ml@ml.com" | true      | "12132023060"
        ""      | ""          | "0537981539"    | "ml@ml.com" | true      | "12132023060"
        ""      | "uneaddress" | "0537981539"   | "ml@ml.com" | true      | "12132023060"
        "un name 1" | "une address" | "0537981539" | "ml"     | true      | "12132023060"
        "un name 1" | "une address" | "0537981539" | "ml.com" | true      | "12132023060"

    }
}

