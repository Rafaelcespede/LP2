package com.example.Service;

import java.util.List;

import com.example.Entity.Autor;


public interface AutorService {
	Autor insertarAutor (Autor a);
	List<Autor> listarAutor();
	Autor buscarAutor(int idautor);
	void eliminarAutor(int idautor);
	Autor actualizarAutor(Autor a);
}
