/**
 * Created by Moghite on 01/12/2016.
 */

import com.m2dl.nuitinfo2016.model.service.Alimentaire
import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

class AlimentaireTest extends Specification {

    Validator validator

    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'un service de type alimentaire #unDescriptif"(String unDescriptif, int uneQuantity) {

        given: "initialisation d'un service alimentaire"
        Alimentaire alimentaire = new Alimentaire(description: unDescriptif, quantity: uneQuantity)

        expect: "le service est valide"
        validator.validate(alimentaire).empty

        where:
        unDescriptif    | uneQuantity
        "nouriture"     | 1

    }

    @Unroll
    void "test l'invalidite d'un service de type alimentaire #unDescriptif"(String unDescriptif, int uneQuantity) {

        given: "initialisation d'un service alimentaire"
        Alimentaire alimentaire = new Alimentaire(description: unDescriptif, quantity: uneQuantity)

        expect: "le service est valide"
        !validator.validate(alimentaire).empty

        where:
        unDescriptif    | uneQuantity
        "nouriture"     | -5
        null            | 5
        ""              | 5

    }
}
