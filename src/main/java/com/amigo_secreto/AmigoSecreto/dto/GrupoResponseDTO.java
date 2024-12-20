package com.amigo_secreto.AmigoSecreto.dto;

import com.amigo_secreto.AmigoSecreto.entities.Grupo;
import com.amigo_secreto.AmigoSecreto.entities.Participante;

public record GrupoResponseDTO(Participante participante, Grupo grupo, Participante dono) {

    public GrupoResponseDTO toGrupoResponseDTO() {
        return new GrupoResponseDTO(participante, grupo, dono);
    }
}
