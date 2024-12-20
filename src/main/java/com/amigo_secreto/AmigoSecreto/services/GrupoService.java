package com.amigo_secreto.AmigoSecreto.services;

import com.amigo_secreto.AmigoSecreto.exceptions.EntityNotFoundException;
import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import com.amigo_secreto.AmigoSecreto.repositories.GrupoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

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

    @Transactional
    public void deletarGrupo(UUID id) {
        listarGrupoPorID(id);
        grupoRepository.deleteById(id);
    }

    public Grupo listarGrupoPorID(UUID id) {
        Grupo grupo = grupoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Não existe um grupo com o id: " + id));
        return grupo;
    }

    @Transactional
    public Grupo renomearGrupo(UUID id, String novoNome) {
        Grupo grupo = grupoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Não existe um grupo com o id: " + id));

        grupo.setNome(novoNome);
        return grupoRepository.save(grupo);
    }
}
