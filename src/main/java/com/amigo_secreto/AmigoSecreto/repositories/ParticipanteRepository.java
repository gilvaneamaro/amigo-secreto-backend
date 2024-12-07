package com.amigo_secreto.AmigoSecreto.repositories;

import com.amigo_secreto.AmigoSecreto.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, UUID> {
    Participante findByCpf(String cpf);
}
