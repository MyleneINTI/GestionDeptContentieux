package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tribunal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private Double fax;
	private Double tel;
	private String region;
	
	@OneToMany(mappedBy = "tribunal")
	private Set<Tache> taches = new HashSet<Tache>();

	
	public Tribunal() {
		super();
	}

	public Tribunal(Long idTribunal, String adresse, Double fax, Double tel, String region, Set<Tache> taches) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		this.taches = taches;
	}

	public Tribunal(String adresse, Double fax, Double tel, String region, Set<Tache> taches) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		this.taches = taches;
	}

	public Tribunal(String adresse, Double fax, Double tel, String region) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Double getFax() {
		return fax;
	}

	public void setFax(Double fax) {
		this.fax = fax;
	}

	public Double getTel() {
		return tel;
	}

	public void setTel(Double tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Tribunal [idTribunal=" + idTribunal + ", adresse=" + adresse + ", fax=" + fax + ", tel=" + tel
				+ ", region=" + region + "]";
	}

}
