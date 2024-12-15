package com.amigo_secreto.AmigoSecreto.controllers;

import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import com.amigo_secreto.AmigoSecreto.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grupo")
public class GrupoController {
    @Autowired
    private GrupoService grupoService;

    @PostMapping
    public Grupo novoGrupo(@RequestBody Grupo grupo) {
        System.out.println("Grupo novo: " + grupo.getDono());
        return grupoService.novoGrupo(grupo);
    }

    @GetMapping
    public List<Grupo> listarGrupos() {
        return grupoService.listarGrupos();
    }
}
