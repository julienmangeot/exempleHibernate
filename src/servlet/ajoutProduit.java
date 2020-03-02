package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IProduitDao;
import dao.ProduitDao;
import model.Produit;

/**
 * Servlet implementation class ajoutProduit
 */
@WebServlet("/add")
public class ajoutProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutProduit() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webpages/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit pr =new Produit();
		IProduitDao dao=new ProduitDao();
		List<Produit> list;
		
		pr.setNomProduit(request.getParameter("name"));
		pr.setDescription(request.getParameter("description"));
		
		dao.createProduit(pr);
			if(dao.createProduit(pr)==true) {
				request.setAttribute("message", "Product successfully created");
			}
			else {
				request.setAttribute("message", "Product creation failed");
			}
		list=dao.showProduct();
			request.setAttribute("listing", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/webpages/produits.jsp").forward(request, response);;
	}

}
