package groovy.com.m2dl.nuitinfo2016.model.poi

import com.m2dl.nuitinfo2016.model.poi.Fixe
import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

/**
 * Created by A.Anass on 02/12/2016.
 */
class FixeTest extends Specification {

    Validator validator

    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'un poi fixe"(String unName, String uneDescription,
                                            String uneAddress, Date uneDate) {

        given: "un individual initialise correctement"
        Fixe fixe = new Fixe(name: unName, description: uneDescription, address: uneAddress,
                startDate: uneDate)

        expect: "l'individual est valide"
        validator.validate(fixe).empty

        where:
        unName     | uneDescription   | uneAddress | uneDate
        "un nom 1" | "uneDescription" | "uneaddress"  | new Date()
    }

    @Unroll
    void "test l'invalidite d'un poi fixe non valide"(String unName, String uneDescription,
                                                        String uneAddress, Date uneDate) {

        given: "un poi fixe initialise de maniere non valide"
        Fixe fixe = new Fixe(name: unName, description: uneDescription, address: uneAddress,
                startDate: uneDate)

        expect: "le poi fixe est invalide"
        !validator.validate(fixe).empty

        where:
        unName | uneDescription   | uneAddress   | uneDate
        null   | null             | null         | null
        null   | null             | null         | new Date()
        null   | null             | "uneaddress" | new Date()
        null   | "uneDescription" | "uneaddress" | new Date()

        ""     | ""               | ""           | null
        ""     | ""               | ""           | new Date()
        ""     | ""               | "uneaddress" | new Date()
        ""     | "uneDescription" | "uneaddress" | new Date()
    }

}
