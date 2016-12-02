package com.m2dl.nuitinfo2016.initialisation;

import com.m2dl.nuitinfo2016.dao.actor.AdministrationDAO;
import com.m2dl.nuitinfo2016.dao.actor.AssociationDAO;
import com.m2dl.nuitinfo2016.dao.actor.IndividualDAO;
import com.m2dl.nuitinfo2016.model.actor.Administration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by A.Anass on 02/12/2016.
 */
@Service
public class Initialisation {

    @Autowired
    private AdministrationDAO administrationDAO;
    @Autowired
    private AssociationDAO associationDAO;
    @Autowired
    private IndividualDAO individualDAO;

    public void initAdministration() throws RuntimeException {
        Administration ad1 = new Administration("CAF", "Rue 1", "03052305", "ml@ml.com");
        Administration ad2 = new Administration("OFII", "Rue 2", "03052305", "ml@ml.com");
        Administration ad3 = new Administration("Prefecture", "Rue 2", "03052305", "ml@ml.com");
        administrationDAO.save(ad1);
        administrationDAO.save(ad2);
        administrationDAO.save(ad3);
    }

    public void initAssociation() throws RuntimeException {

    }

    public void initIndividual() throws RuntimeException {

    }
}
