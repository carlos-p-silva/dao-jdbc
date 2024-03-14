package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Principal {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//Seller seller = sellerDao.findById(3);
		
		//Department department = new Department(2, null);
		//List<Seller> list = sellerDao.findByDepartment(department);
		List<Seller> list = sellerDao.findAll();
		
		for (Seller sel : list) {
			System.out.println(sel);
		}

	}

}
