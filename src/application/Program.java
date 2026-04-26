package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("==== Teste 1: FindById ====");
		SellerDao sellerdao = DaoFactory.creatSellerDao();
		
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n==== Teste 2: seller FindByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		
		for (Seller a : list) {
			System.out.println(a);
		}
	}

}
