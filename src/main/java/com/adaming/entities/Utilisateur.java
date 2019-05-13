package com.adaming.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	private String nom;
	private String prenom;
	
	@ManyToMany
	@JoinTable(	name = "UTILISATEUR_TACHE",
				joinColumns = @JoinColumn(name = "UTILISATEUR_ID", referencedColumnName = "idUtilisateur"),
				inverseJoinColumns = @JoinColumn(name = "TACHE_ID", referencedColumnName = "idTache"))
	private Set<Tache> taches;

	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long idUtilisateur, String email, String nom, String prenom, Set<Tache> taches) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.taches = taches;
	}
	
	public Utilisateur(Long idUtilisateur, String email, String nom, String prenom) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur(String email, String nom, String prenom, Set<Tache> taches) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.taches = taches;
	}

	public Utilisateur(String email, String nom, String prenom) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", email=" + email + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}	

}
