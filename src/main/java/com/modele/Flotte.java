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
@Table(name = "FLOTTE")
@NamedQueries({
    @NamedQuery(name = "Flotte.findAll", query = "SELECT f FROM Flotte f")})
public class Flotte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 25)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 25)
    @Column(name = "LONGUEUR")
    private String longueur;
    @Size(max = 25)
    @Column(name = "LARGEUR")
    private String largeur;
    @Size(max = 25)
    @Column(name = "PORTATTACHE")
    private String portattache;
    @Size(max = 25)
    @Column(name = "CAPACITE")
    private String capacite;
    @Size(max = 25)
    @Column(name = "VITESSE")
    private String vitesse;
    @Size(max = 25)
    @Column(name = "LATITUDE")
    private String latitude;
    @Size(max = 25)
    @Column(name = "LONGITUDE")
    private String longitude;
    @Size(max = 25)
    @Column(name = "NBR_CONTAINER")
    private String nbrContainer;

    public Flotte() {
    }

    public Flotte(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLongueur() {
        return longueur;
    }

    public void setLongueur(String longueur) {
        this.longueur = longueur;
    }

    public String getLargeur() {
        return largeur;
    }

    public void setLargeur(String largeur) {
        this.largeur = largeur;
    }

    public String getPortattache() {
        return portattache;
    }

    public void setPortattache(String portattache) {
        this.portattache = portattache;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getVitesse() {
        return vitesse;
    }

    public void setVitesse(String vitesse) {
        this.vitesse = vitesse;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getNbrContainer() {
        return nbrContainer;
    }

    public void setNbrContainer(String nbrContainer) {
        this.nbrContainer = nbrContainer;
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
        if (!(object instanceof Flotte)) {
            return false;
        }
        Flotte other = (Flotte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modele.Flotte[ id=" + id + " ]";
    }
    
}
