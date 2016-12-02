package groovy.com.m2dl.nuitinfo2016.model.poi

import com.m2dl.nuitinfo2016.model.actor.Actor
import com.m2dl.nuitinfo2016.model.poi.Event
import spock.lang.Specification
import spock.lang.Unroll

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory
/**
 * Created by A.Anass on 02/12/2016.
 */
class EventTest extends Specification {

    Validator validator

    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Unroll
    void "test la validite d'un poi event "(String unName, String uneDescription, String uneAddress,
                                          Actor unOwner, Date uneStartDate, Date uneEndDate) {

        given: "d'un poi event initialise correctement"
        Event event = new Event(name: unName, description: uneDescription, address: uneAddress,
                owner: unOwner, startDate: uneStartDate, endDate: uneEndDate)

        expect: "l'individual est valide"
        validator.validate(event).empty

        where:
        unName     | uneDescription   | uneAddress   | unOwner     | uneStartDate | uneEndDate
        "un nom 1" | "uneDescription" | "uneaddress" | Mock(Actor) | new Date()   | new Date()
    }

    @Unroll
    void "test l'invalidite d'un poi event non valide"(String unName, String uneDescription, String uneAddress,
                                                      Actor unOwner, Date uneStartDate, Date uneEndDate) {

        given: "un poi event initialise de maniere non valide"
        Event event = new Event(name: unName, description: uneDescription, address: uneAddress,
                owner: unOwner, startDate: uneStartDate, endDate: uneEndDate)

        expect: "le poi event est invalide"
        !validator.validate(event).empty

        where:
        unName | uneDescription   | uneAddress   | unOwner     | uneStartDate | uneEndDate
        null   | null             | null         | null        | null         | null
        null   | null             | null         | null        | null         | new Date()
        null   | null             | null         | null        | new Date()   | new Date()
        null   | null             | null         | Mock(Actor) | new Date()   | new Date()
        null   | null             | "uneaddress" | Mock(Actor) | new Date()   | new Date()
        null   | "uneDescription" | "uneaddress" | Mock(Actor) | new Date()   | new Date()
        ""     | ""               | ""           | null        | null         | null
        ""     | ""               | ""           | null        | null         | new Date()
        ""     | ""               | ""           | null        | new Date()   | new Date()
        ""     | ""               | ""           | Mock(Actor) | new Date()   | new Date()
        ""     | ""               | "uneaddress" | Mock(Actor) | new Date()   | new Date()
        ""     | "uneDescription" | "uneaddress" | Mock(Actor) | new Date()   | new Date()
    }
}
