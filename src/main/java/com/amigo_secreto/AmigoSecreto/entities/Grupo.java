package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="participante_lista_tb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Grupo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID idGrupo;
}
