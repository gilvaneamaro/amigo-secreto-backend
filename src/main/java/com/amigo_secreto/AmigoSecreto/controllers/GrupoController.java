package com.amigo_secreto.AmigoSecreto.controllers;

import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import com.amigo_secreto.AmigoSecreto.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/grupo")
public class GrupoController {
    @Autowired
    private GrupoService grupoService;

    @PostMapping
    public ResponseEntity<Grupo> novoGrupo(@RequestBody Grupo grupo) {
        System.out.println("Grupo novo: " + grupo.getDono());
        return ResponseEntity.ok().body(grupoService.novoGrupo(grupo));
    }

    @GetMapping
    public ResponseEntity<List<Grupo>> listarGrupos() {
        return ResponseEntity.ok().body(grupoService.listarGrupos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarGrupo(@PathVariable UUID id) {
        grupoService.deletarGrupo(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grupo> renomearGrupo(@PathVariable UUID id, @RequestBody Grupo novoNome) {
        return ResponseEntity.status(HttpStatus.OK).body(grupoService.renomearGrupo(id, novoNome.getNome()));
    }
}
