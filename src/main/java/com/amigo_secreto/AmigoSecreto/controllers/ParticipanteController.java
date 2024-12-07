package com.amigo_secreto.AmigoSecreto.controllers;

import com.amigo_secreto.AmigoSecreto.entities.Participante;
import com.amigo_secreto.AmigoSecreto.services.ParticipanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/participante")
public class ParticipanteController {
    final private ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @GetMapping
    public ResponseEntity<List<Participante>> getParticipantes() {
        return ResponseEntity.ok().body(participanteService.getParticipantes());
    }

    @PostMapping
    public ResponseEntity<Participante> createParticipante(@RequestBody Participante participante) {
        return ResponseEntity.ok().body(participanteService.save(participante));
    }
}
