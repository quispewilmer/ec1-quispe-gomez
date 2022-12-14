package com.evaluations.ecquispegomez.repository;

import com.evaluations.ecquispegomez.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
