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
import ma.projet.dao.IDao;
import ma.projet.beans.Homme;
import ma.projet.beans.Femme;
import ma.projet.beans.Mariage;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HommeService implements IDao<Homme> {
    private Object session;

    @Override
    public void create(Homme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Homme getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Homme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Homme entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Homme> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Femme> getEpousesEntreDates(Homme homme, Date dateDebut, Date dateFin) {
   public long getHommesMariesParQuatreFemmesEntreDates(Date dateDebut, Date dateFin) {
    Criteria criteria = session.createCriteria(Homme.class);
    criteria.createAlias("mariages", "m");
    criteria.add(Restrictions.ge("m.dateDebut", dateDebut));
    criteria.add(Restrictions.le("m.dateFin", dateFin));
    criteria.setProjection(Projections.groupProperty("id"));
    criteria.add(Restrictions.sqlRestriction("count(m.id) >= 4"));
    return ((Number) criteria.uniqueResult()).longValue();
}
}


    


