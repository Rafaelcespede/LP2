package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Autor;
import com.example.Repository.AutorRepository;
import com.example.Service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository ar;
	
	@Override
	public Autor insertarAutor(Autor a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}

	@Override
	public List<Autor> listarAutor() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Autor buscarAutor(int idautor) {
		// TODO Auto-generated method stub
		return ar.findById(idautor).get();
	}

	@Override
	public void eliminarAutor(int idautor) {
		// TODO Auto-generated method stub
		ar.deleteById(idautor);
	}

	@Override
	public Autor actualizarAutor(Autor a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}

}
