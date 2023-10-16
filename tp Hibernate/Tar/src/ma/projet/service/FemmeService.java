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


import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import ma.projet.dao.IDao;
import ma.projet.beans.Homme;
import ma.projet.beans.Femme;
import ma.projet.beans.Mariage;



public class FemmeService implements IDao<Femme> {
    private Object session;

    @Override
    public void create(Femme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Femme getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Femme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Femme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Femme> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getNombreEnfantsEntreDates(Femme femme, Date dateDebut, Date dateFin) {
    Query query = session.getNamedQuery("getNombreEnfants");
    query.setParameter("femmeId", femme.getId());
    query.setParameter("dateDebut", dateDebut);
    query.setParameter("dateFin", dateFin);
    return (int) query.uniqueResult();
}

    public List<Femme> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


    

