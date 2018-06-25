/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modele;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author esic
 */
@Entity
@Table(name = "MARCHANDISE")
@NamedQueries({
    @NamedQuery(name = "Marchandise.findAll", query = "SELECT m FROM Marchandise m")})
public class Marchandise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 25)
    @Column(name = "BATEAU")
    private String bateau;
    @Size(max = 25)
    @Column(name = "DEPART")
    private String depart;
    @Size(max = 25)
    @Column(name = "DESTINATION")
    private String destination;
    @Size(max = 25)
    @Column(name = "CLIENT")
    private String client;
    @Size(max = 25)
    @Column(name = "POIDS")
    private String poids;

    public Marchandise() {
    }

    public Marchandise(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBateau() {
        return bateau;
    }

    public void setBateau(String bateau) {
        this.bateau = bateau;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marchandise)) {
            return false;
        }
        Marchandise other = (Marchandise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modele.Marchandise[ id=" + id + " ]";
    }
    
}
