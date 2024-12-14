package com.amigo_secreto.AmigoSecreto.services;

import com.amigo_secreto.AmigoSecreto.entities.Participante;
import com.amigo_secreto.AmigoSecreto.repositories.ParticipanteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParticipanteService {
    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> getParticipantes() {
        return participanteRepository.findAll();
    }

    @Transactional
    public Participante save(Participante participante) {
        return participanteRepository.save(participante);
    }

    public Participante getByCpf( String cpf) {
        return participanteRepository.findByCpf(cpf);
    }
}
