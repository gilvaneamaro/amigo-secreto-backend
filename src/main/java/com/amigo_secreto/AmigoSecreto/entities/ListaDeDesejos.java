package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "lista_desejo_tb")
public class ListaDeDesejos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


}
