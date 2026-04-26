package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n==== Teste 3: seller FindAll====");
		list = sellerdao.findAll();
		
		for (Seller a : list) {
			System.out.println(a);
		}
		
		System.out.println("\n==== Teste 4: Seller insert ====");
		
		Seller newSeller = new Seller(null , "Enzo", "Enzo@gmail.com",new Date(), 4000.00, department);
		
		sellerdao.insert(newSeller);
		
		System.out.println("Inserido! Novo id = " + newSeller.getId());
		
		System.out.println("\n==== Teste 5: Seller Update ====");
		seller = sellerdao.findById(1);
		seller.setName("GuiduSm");
		
		sellerdao.update(seller);
		
		System.out.println("Update completo!");
		
		System.out.println("\n==== Teste 6: Seller Delete ====");
		
		System.out.println("Informe um ID: ");
		int id = sc.nextInt();
		sellerdao.deleteById(id);
		
		System.out.println("Exclusão completa!");
		
		sc.close();
	}

}
