package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "participante_tb")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "par_id")
    private UUID id;

    @Column(name = "par_nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "par_email", nullable = false, unique = true)
    private String email;

    @Column(name = "par_cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name="par_senha", nullable = false)
    private String senha;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL)
    private Set<Grupo> gruposCriados;

    @ManyToMany(mappedBy = "participantes")
    private Set<Grupo> grupos;


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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Participante(UUID id, String nome, String email, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Participante() {}
}
