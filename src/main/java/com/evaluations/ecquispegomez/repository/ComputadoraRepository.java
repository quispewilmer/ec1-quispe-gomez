package com.evaluations.ecquispegomez.repository;

import com.evaluations.ecquispegomez.model.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadoraRepository extends JpaRepository<Computadora, Integer> {
}
