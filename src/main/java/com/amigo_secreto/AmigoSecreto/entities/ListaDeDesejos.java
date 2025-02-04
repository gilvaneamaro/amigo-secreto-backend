package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "lista_desejo_tb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListaDeDesejos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID participanteId;

    private Set<String> listaDeDesejos;
}
