package com.neo.tpsaludable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.tpsaludable.model.Informe;

@Repository
public interface InformeRepository extends JpaRepository<Informe,Long> {

}
