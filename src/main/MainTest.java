package main;

import dao.IProduitDao;
import dao.ProduitDao;
import model.Produit;

public class MainTest {

	public static void main(String[] args) {
		
		Produit pr=new Produit("Samsung S10", "Beau produit fiable");
		IProduitDao dao= new ProduitDao();
		
		dao.createProduit(pr);

	}

}
