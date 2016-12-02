package com.m2dl.nuitinfo2016.initialisation;

import com.m2dl.nuitinfo2016.dao.actor.AdministrationDAO;
import com.m2dl.nuitinfo2016.dao.actor.AssociationDAO;
import com.m2dl.nuitinfo2016.dao.actor.IndividualDAO;
import com.m2dl.nuitinfo2016.dao.poi.FixeDAO;
import com.m2dl.nuitinfo2016.model.actor.Administration;
import com.m2dl.nuitinfo2016.model.actor.Association;
import com.m2dl.nuitinfo2016.model.actor.Individual;
import com.m2dl.nuitinfo2016.model.poi.Fixe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    @Autowired
    private FixeDAO fixeDAO;

    private Administration caf;
    private Administration ofii;
    private Administration prefecture;

    private Association ass1;
    private Association ass2;
    private Association ass3;

    private Individual indiv1;
    private Individual indiv2;
    private Individual indiv3;

    private Fixe cafFixe;
    private Fixe ofiiFixe;
    private Fixe prefFixe;

    public void initAdministration() throws RuntimeException {
        caf = new Administration("CAF", "24 Rue Riquet, 31400, Toulouse", "0810253110", "ml@ml.com");
        ofii = new Administration("OFII", "7 Rue Arthur Rimbaud, 31203 Toulouse", "0534417220", "ml@ml.com");
        prefecture = new Administration("Prefecture", "1 Rue Sainte-Anne, 31000, Toulouse", "0534453445", "ml@ml.com");
        administrationDAO.save(caf);
        administrationDAO.save(ofii);
        administrationDAO.save(prefecture);
    }

    public void initAssociation() throws RuntimeException {
        ass1 = new Association("ass1", "Rue 1", "03052305", "ml@ml.com", false, "120599255185");
        ass2 = new Association("ass2", "Rue 1", "03052305", "ml@ml.com", false, "120599255185");
        ass3 = new Association("ass3", "Rue 1", "03052305", "ml@ml.com", true, "120599255185");
        associationDAO.save(ass1);
        associationDAO.save(ass2);
        associationDAO.save(ass3);
    }

    public void initIndividual() throws RuntimeException {
        indiv1 = new Individual("indiv1", "Rue 1", "03052305", "ml@ml.com");
        indiv2 = new Individual("indiv2", "Rue 1", "03052305", "ml@ml.com");
        indiv3 = new Individual("indiv3", "Rue 1", "03052305", "ml@ml.com");
        individualDAO.save(indiv1);
        individualDAO.save(indiv2);
        individualDAO.save(indiv3);
    }

    public void initPoi() {
        //Point p1 = new Point(new Float(10.0f),new Float(10.0f);
        cafFixe = new Fixe("CAF", "LA CAF", "Rue 1", caf, new Float(10.f), new Float(10.f), new Date());
        //ofiiFixe = new Fixe("OFII", "LA OFII", "Rue 1", ofii, new Point(), new Date());
        //prefFixe = new Fixe("Pref", "Prefecture", "Rue 1", prefecture, new Point(), new Date());
        fixeDAO.save(cafFixe);
        //fixeDAO.save(ofiiFixe);
        //fixeDAO.save(prefFixe);
        caf.getPois().add(cafFixe);
    }
}
