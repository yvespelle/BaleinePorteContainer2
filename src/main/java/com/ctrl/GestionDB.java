/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.employes.utils.EmployesConstantes;
import static com.employes.utils.EmployesConstantes.REQUEST_SELECT_TOUS_EMPLOYES;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author esic
 */
@Stateless
public class GestionDB {

    @PersistenceContext(unitName = "solutec-lyon_BaleinePorteContainer_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public Collection getUtilisateurs() {
        Query q = em.createQuery(EmployesConstantes.REQUEST_SELECT_UTILISATEURS);
        return q.getResultList();
    }
public Collection getEmployes() {
        Query q = em.createQuery(REQUEST_SELECT_TOUS_EMPLOYES);
        return q.getResultList();
    }

public Collection getClients() {
        Query q = em.createQuery(EmployesConstantes.REQUEST_SELECT_TOUS_CLIENTS);
        return q.getResultList();
    }

public Collection getMarchandises() {
        Query q = em.createQuery(EmployesConstantes.REQUEST_SELECT_TOUS_MARCHANDISES);
        return q.getResultList();
    }












    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
