package com.m2dl.nuitinfo2016.model.actor;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
@JsonTypeName("Association")
public class Association extends Actor {

    private boolean valide;

    @NotNull
    @NotBlank
    private String siret;

    public Association() {
    }

    public Association(String name, String address, String phoneNumber, String mail, boolean valide, String siret) {
        super(name, address, phoneNumber, mail);
        this.valide = valide;
        this.siret = siret;
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }
}
