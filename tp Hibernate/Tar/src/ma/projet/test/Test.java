/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.service.FemmeService;

/**
 *
 * @author hasna
 */
public class Test {
    
    public static void main(String[] args) {
        // Créez 10 femmes et 5 hommes, puis sauvegardez-les dans la base de données.

        // Afficher la liste des femmes
        FemmeService femmeService = new FemmeService();
        List<Femme> femmes = femmeService.getAll();
        for (Femme femme : femmes) {
            System.out.println(femme.getNom() + " " + femme.getPrenom());
        }

       public  Femme getFemmeLaPlusAgee() {
    List<Femme> femmes = getAll();
    Femme femmePlusAgee = null;
    Date datePlusAncienne = new Date(); // Initialisation à une date future

    for (Femme femme : femmes) {
        if (femme.getDateNaissance().before(datePlusAncienne)) {
            datePlusAncienne = femme.getDateNaissance();
            femmePlusAgee = femme;
        }
    }
    
    return femmePlusAgee;
}
Femme femmeLaPlusAgee = femmeService.getFemmeLaPlusAgee();
if (femmeLaPlusAgee != null) {
    System.out.println("Femme la plus âgée : " + femmeLaPlusAgee.getNom() + " " + femmeLaPlusAgee.getPrenom());
    System.out.println("Date de naissance : " + femmeLaPlusAgee.getDateNaissance());
} else {
    System.out.println("Aucune femme n'est présente dans la base de données.");
}


        // Afficher les épouses d'un homme passé en paramètre

        // Afficher le nombre d'enfants d'une femme passée en paramètre entre deux dates

        // Afficher la liste des femmes mariées deux fois ou plus

        // Afficher qui sont mariés par quatre femmes entre deux dates

        // Afficher les mariages d'un homme passé en paramètre

    private List<Femme> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
}

}
