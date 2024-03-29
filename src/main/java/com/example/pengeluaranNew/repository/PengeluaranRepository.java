package com.example.pengeluaranNew.repository;

import com.example.pengeluaranNew.domain.Pengeluaran;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PengeluaranRepository extends JpaRepository<Pengeluaran,Integer>, JpaSpecificationExecutor<Pengeluaran>{

	Pengeluaran findByName(String name);

	Pengeluaran findByUuid(String uuid);

}