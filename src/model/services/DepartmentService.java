package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	//inje��o de depend�ncia usando padr�o factory
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	//m�todo que retorna lista de departamentos com dados 'mocados'
	public List<Department> findAll(){
		return dao.findAll();
		/*
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Electronics"));
		return list;
		*/
	}
}
