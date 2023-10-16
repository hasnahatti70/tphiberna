/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

/**
 *
 * @author hasna
 */

import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.beans.Homme;
import ma.projet.beans.Femme;
import ma.projet.beans.Mariage;





public class MariageService implements IDao<Mariage> {

    @Override
    public void create(Mariage entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mariage getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Mariage entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Mariage entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mariage> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void afficherMariagesHomme(Homme homme) {
    System.out.println("Nom : " + homme.getNom() + " " + homme.getPrenom());
    System.out.println("Mariages En Cours :");
    
    for (Mariage mariage : homme.getMariages()) {
        System.out.println("Femme : " + mariage.getFemme().getNom() + " " + mariage.getFemme().getPrenom());
        System.out.println("Date Début : " + mariage.getDateDebut());
        System.out.println("Nbr Enfants : " + mariage.getNombreEnfants());
    }

    System.out.println("Mariages échoués :");
    
    for (Mariage mariage : homme.getMariagesEchoues()) {
        System.out.println("Femme : " + mariage.getFemme().getNom() + " " + mariage.getFemme().getPrenom());
        System.out.println("Date Début : " + mariage.getDateDebut());
        System.out.println("Date Fin : " + mariage.getDateFin());
        System.out.println("Nbr Enfants : " + mariage.getNombreEnfants());
    }
}

}

    

