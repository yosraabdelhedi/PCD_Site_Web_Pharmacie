package com.model;

// Generated 24 avr. 2014 01:05:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Produit generated by hbm2java
 */
@Entity
@Table(name = "Produit", catalog = "BD_PCD")
public class Produit implements java.io.Serializable {

	private Integer idProduit;
	private String nomCommercial;
	private String dci;
	private String famille;
	private String prixUnitaire;
	private String qantit�Disp;
	private Date datePerim�;
	private Set<Livraison> livraisons = new HashSet<Livraison>(0);
	private Set<Commande> commandes = new HashSet<Commande>(0);

	public Produit() {
	}

	public Produit(String nomCommercial, String dci, String famille,
			String prixUnitaire, String qantit�Disp, Date datePerim�,
			Set<Livraison> livraisons, Set<Commande> commandes) {
		this.nomCommercial = nomCommercial;
		this.dci = dci;
		this.famille = famille;
		this.prixUnitaire = prixUnitaire;
		this.qantit�Disp = qantit�Disp;
		this.datePerim� = datePerim�;
		this.livraisons = livraisons;
		this.commandes = commandes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idProduit", unique = true, nullable = false)
	public Integer getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	@Column(name = "NomCommercial", length = 45)
	public String getNomCommercial() {
		return this.nomCommercial;
	}

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}

	@Column(name = "DCI", length = 45)
	public String getDci() {
		return this.dci;
	}

	public void setDci(String dci) {
		this.dci = dci;
	}

	@Column(name = "Famille", length = 45)
	public String getFamille() {
		return this.famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	@Column(name = "PrixUnitaire", length = 16777215)
	public String getPrixUnitaire() {
		return this.prixUnitaire;
	}

	public void setPrixUnitaire(String prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	@Column(name = "Qantit�Disp", length = 16777215)
	public String getQantit�Disp() {
		return this.qantit�Disp;
	}

	public void setQantit�Disp(String qantit�Disp) {
		this.qantit�Disp = qantit�Disp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date_Perim�", length = 10)
	public Date getDatePerim�() {
		return this.datePerim�;
	}

	public void setDatePerim�(Date datePerim�) {
		this.datePerim� = datePerim�;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	public Set<Livraison> getLivraisons() {
		return this.livraisons;
	}

	public void setLivraisons(Set<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

}
