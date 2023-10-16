/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.dao;
import java.util.List;

/**
 *
 * @author hasna
 */

  



public interface IDao<T> {
    void create(T entity);
    T getById(int id);
    void update(T entity);
    void delete(T entity);
    List<T> getAll();
}

    

