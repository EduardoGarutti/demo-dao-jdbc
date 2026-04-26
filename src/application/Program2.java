package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==== Teste 1: Método de Inserir ====");
		Department dep = new Department(null, "Musica");
		
		DepartmentDao depDao = DaoFactory.creatDepartmentDao();
		
		depDao.insert(dep);
		
		System.out.println("Inserção feita com sucesso! Novo id: "+ dep.getId());
		
		System.out.println("==== Teste 2: Método de Update ====");
		
		System.out.println("Digite um novo nome para o Departamento: ");
		dep.setName(sc.nextLine());
		System.out.println("Digite o id para fazer o update: ");
		dep.setId(sc.nextInt());
		
		depDao.update(dep);
		
		System.out.println("Update realizado com sucesso! ");
		
		System.out.println("==== Teste 3: Método de Delete ====");
		
		System.out.println("Informe o Id do Departamento a deletar: ");
		int id = sc.nextInt();
		
		depDao.deleteById(id);
		
		System.out.println("Departamento Deletado com sucesso!");
		
		
		
		sc.close();
	}

}
