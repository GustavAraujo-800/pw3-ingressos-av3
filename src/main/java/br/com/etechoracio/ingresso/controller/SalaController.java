package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class SalaController {
    @Autowired
    private SalaService salaService;
    @GetMapping("/sala")
    public List<SalaResponseDTO> findByEmCartaz() {
        return salaService.buscarSalasAtivas();
    }
    @GetMapping
    public ResponseEntity<List<SalaResponseDTO>> listarSalasAtivas() {
        List<SalaResponseDTO> salas = salaService.buscarSalasAtivas();
        return ResponseEntity.ok(salas);
    }
}
