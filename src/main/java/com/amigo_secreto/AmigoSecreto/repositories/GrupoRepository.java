package com.amigo_secreto.AmigoSecreto.repositories;

import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
}
