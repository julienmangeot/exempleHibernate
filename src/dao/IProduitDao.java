package dao;

import model.Produit;

public interface IProduitDao {
	
	public boolean createProduit(Produit product);
	
	public boolean deleteProduit(int id);

}
