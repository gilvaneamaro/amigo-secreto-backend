package com.amigo_secreto.AmigoSecreto.services;

import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import com.amigo_secreto.AmigoSecreto.repositories.GrupoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    @Autowired
    private GrupoRepository grupoRepository;

    @Transactional
    public Grupo novoGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public List<Grupo> listarGrupos() {
        return grupoRepository.findAll();
    }
}
