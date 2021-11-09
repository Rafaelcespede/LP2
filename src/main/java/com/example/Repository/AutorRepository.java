package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
