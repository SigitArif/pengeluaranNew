package com.example.pengeluaranNew.controller;

import java.util.List;

import com.example.pengeluaranNew.domain.Pengeluaran;
import com.example.pengeluaranNew.service.PengeluaranService;
import com.example.pengeluaranNew.vo.ResultVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pengeluaranku-service/api/v1/pengeluaran")
public class PengeluaranController{

    @Autowired
    PengeluaranService pengeluaranService;
    
    @GetMapping(value="/list")
    @ResponseBody
    public ResponseEntity<ResultVO> getList(){
        List<Pengeluaran> listPengeluaran = pengeluaranService.getList();
        ResultVO resultVO = new ResultVO();
        resultVO.setResults(listPengeluaran);
        resultVO.setMessage("Pengeluaran berhasil di peroleh");
        resultVO.setStatus(200);
        
        return null;
        
    }
}