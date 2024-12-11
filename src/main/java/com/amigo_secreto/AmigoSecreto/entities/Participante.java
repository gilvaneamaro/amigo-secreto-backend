package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "participante_tb")
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "par_id")
    private UUID id;

    @Column(name = "par_nome")
    private String nome;

    @Column(name = "par_email")
    private String email;

    @Column(name = "par_cpf")
    private String cpf;

}
