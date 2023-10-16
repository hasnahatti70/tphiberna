/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author hasna
 */
 @Entity
 @Table(name = "femmes")
   

public class Femme extends Personne {

        public Femme(String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
            super(nom, prenom, telephone, adresse, dateNaissance);
        }
    
}

