package com.amigo_secreto.AmigoSecreto.services;

import com.amigo_secreto.AmigoSecreto.entities.Sorteio;
import com.amigo_secreto.AmigoSecreto.repositories.SorteioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class SorteioService {
    private SorteioRepository sorteioRepository;

    public List<Sorteio> realizaSorteio(UUID idGrupo) {
        return new LinkedList<>();
    }
}
