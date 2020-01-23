package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //inserir no banco de dados o objeto que estou enviando como parametro
	void update(Seller obj); 
	void deleteById(Integer id);
	Seller findById(Integer id); //vai pegar esse id e consultar no banco de dados o objeto com esse id
	//Se existir, vai retornar o obj, se não, vai retornar nulo
	
	List<Seller> findAll(); //retorna todos os vendedores

}
