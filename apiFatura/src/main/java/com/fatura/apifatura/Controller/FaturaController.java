package com.fatura.apifatura.Controller;


import com.fatura.apifatura.Model.Fatura;
import com.fatura.apifatura.Repository.FaturaRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaRepository faturaRepository;
    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    @GetMapping
    public List<Fatura> listar() {
        return faturaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Fatura> fatura(@Valid @RequestBody Fatura fatura) {
        return ResponseEntity.ok(faturaRepository.save(fatura));
    }
}
