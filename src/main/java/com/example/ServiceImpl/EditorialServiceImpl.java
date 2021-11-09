package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Editorial;
import com.example.Repository.EditorialRepository;
import com.example.Service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService {
	
	@Autowired
	private EditorialRepository er;
	
	@Override
	public Editorial insertarEditorial(Editorial e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

	@Override
	public List<Editorial> listarEditorial() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Editorial buscarEditorial(int ideditorial) {
		// TODO Auto-generated method stub
		return er.findById(ideditorial).get();
	}

	@Override
	public void eliminarEditorial(int ideditorial) {
		// TODO Auto-generated method stub
		er.deleteById(ideditorial);
	}

	@Override
	public Editorial actualizarEditorial(Editorial e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

}
