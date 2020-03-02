package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Produit;

public class ProduitDao implements IProduitDao{
	
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();

	public boolean createProduit(Produit product) {
		try {
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		
		System.out.println("succeded product creation");
		return true;
		}
		catch (HibernateException e){
			e.printStackTrace();
			System.out.println("failed product creation");
			return false;
		}
	}

	public boolean deleteProduit(int id) {
		try {
		Produit pr =new Produit();
		pr.setIdProduit(id);
		
		session.beginTransaction();
		session.delete(pr);
		session.getTransaction().commit();
		
		System.out.println("succeded product suppression");
		return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("failed product suppresssion");
			return false;
		}
		
	}

}
