package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //inserir no banco de dados o objeto que estou enviando como parametro
	void update(Department obj); 
	void deleteById(Integer id);
	Department findById(Integer id); //vai pegar esse id e consultar no banco de dados o objeto com esse id
	//Se existir, vai retornar o obj, se não, vai retornar nulo
	
	List<Department> findAll(); //retorna todos os departamentos

}
