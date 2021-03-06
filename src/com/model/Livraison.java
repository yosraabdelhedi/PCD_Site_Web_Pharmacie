package com.model;

// Generated 24 avr. 2014 01:05:02 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Livraison generated by hbm2java
 */
@Entity
@Table(name = "Livraison", catalog = "BD_PCD")
public class Livraison implements java.io.Serializable {

	private LivraisonId id;
	private BonDeLivraison bonDeLivraison;
	private Fournisseur fournisseur;
	private Produit produit;

	public Livraison() {
	}

	public Livraison(LivraisonId id, Fournisseur fournisseur, Produit produit) {
		this.id = id;
		this.fournisseur = fournisseur;
		this.produit = produit;
	}

	public Livraison(LivraisonId id, BonDeLivraison bonDeLivraison,
			Fournisseur fournisseur, Produit produit) {
		this.id = id;
		this.bonDeLivraison = bonDeLivraison;
		this.fournisseur = fournisseur;
		this.produit = produit;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "produitIdProduit", column = @Column(name = "Produit_idProduit", nullable = false)),
			@AttributeOverride(name = "fournisseurIdFournisseur", column = @Column(name = "Fournisseur_idFournisseur", nullable = false)) })
	public LivraisonId getId() {
		return this.id;
	}

	public void setId(LivraisonId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RefBonLivraison")
	public BonDeLivraison getBonDeLivraison() {
		return this.bonDeLivraison;
	}

	public void setBonDeLivraison(BonDeLivraison bonDeLivraison) {
		this.bonDeLivraison = bonDeLivraison;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Fournisseur_idFournisseur", nullable = false, insertable = false, updatable = false)
	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Produit_idProduit", nullable = false, insertable = false, updatable = false)
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
