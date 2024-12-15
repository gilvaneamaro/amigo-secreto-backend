package com.amigo_secreto.AmigoSecreto.repositories;

import com.amigo_secreto.AmigoSecreto.entities.ListaDeDesejos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ListaDeDesejosRepository extends JpaRepository<ListaDeDesejos, UUID> {
}
