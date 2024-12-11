package com.amigo_secreto.AmigoSecreto.controllers;

import com.amigo_secreto.AmigoSecreto.entities.Participante;
import com.amigo_secreto.AmigoSecreto.entities.Sorteio;
import com.amigo_secreto.AmigoSecreto.services.SorteioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/sorteio")
public class SorteioController {
    @Autowired
    private SorteioService sorteioService;

    public ResponseEntity<List<Sorteio>> criaGrupoSorteio(UUID idGrupo) {
        return ResponseEntity.ok().body(sorteioService.realizaSorteio(idGrupo));
    }
}
