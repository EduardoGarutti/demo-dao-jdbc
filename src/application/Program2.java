package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==== Teste 1 : Método de Inserir ====");
		Department dep = new Department(null, "Musica");
		
		DepartmentDao depDao = DaoFactory.creatDepartmentDao();
		
		depDao.insert(dep);
		
		System.out.println("Inserção feita com sucesso! ");
		sc.close();
	}

}
