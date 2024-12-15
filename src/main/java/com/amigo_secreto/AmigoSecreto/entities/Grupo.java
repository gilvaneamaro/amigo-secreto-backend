package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="grupo_tb")
public class Grupo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "gru_id")
    private UUID idGrupo;

    @ManyToOne
    @JoinColumn(name = "gru_dono", nullable = false)
    private Participante dono;

    @Column(name = "gru_nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "grupo_participante_tb",
            joinColumns = @JoinColumn(name = "gru_id"),
            inverseJoinColumns = @JoinColumn(name = "par_id")
    )
    private Set<Participante> participantes;

    public Grupo(UUID idGrupo, Participante dono, String nome, Set<Participante> participantes) {
        this.idGrupo = idGrupo;
        this.dono = dono;
        this.nome = nome;
        this.participantes = participantes;
    }

    public Grupo() {}

    public UUID getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(UUID idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Participante getDono() {
        return dono;
    }

    public void setDono(Participante dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }
}
