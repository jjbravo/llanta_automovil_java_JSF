/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sessions;

import com.example.model.Llanta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adsi2
 */
@Stateless
public class LlantaSession {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Llanta llanta){
        entityManager.persist(llanta);
        
    }
    public List<Llanta> findAll(){
        return entityManager.createNamedQuery("Llanta.findAll").getResultList();
    }
}
