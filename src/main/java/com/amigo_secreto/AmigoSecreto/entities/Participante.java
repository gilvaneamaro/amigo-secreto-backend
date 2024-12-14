package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "participante_tb")
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Participante(UUID id, String nome, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public Participante() {
    }
}
