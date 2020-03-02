package dao;

import java.util.List;

import model.Produit;

public interface IProduitDao {
	
	public boolean createProduit(Produit product);
	
	public boolean deleteProduit(int id);
	
	public List<Produit> showProduct();

}
