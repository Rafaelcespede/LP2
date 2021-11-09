package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Editorial;


@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

}
