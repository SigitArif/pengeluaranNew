package com.example.pengeluaranNew.service;

import java.util.List;

import com.example.pengeluaranNew.domain.Pengeluaran;
import com.example.pengeluaranNew.repository.PengeluaranRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PengeluaranService{

@Autowired
PengeluaranRepository pengeluaranRepository;

    public List<Pengeluaran> getList(){
        List<Pengeluaran> listPengeluaran = pengeluaranRepository.findAll();

        return listPengeluaran;
    }

}