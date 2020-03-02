package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Produit {
	
	//Attributs
	@Id
	@GeneratedValue
	private int idProduit;
	
	private String nomProduit;
	@Transient
	private String description;

	public Produit() {
	}

	public Produit(String nomProduit, String description) {
		this.nomProduit = nomProduit;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", description=" + description + "]";
	}

	
	
	
	

}
