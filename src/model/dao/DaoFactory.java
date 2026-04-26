package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJBDC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao creatDepartmentDao() {
		return new DepartmentDaoJBDC(DB.getConnection());
	}
}
