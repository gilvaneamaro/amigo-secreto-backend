package com.amigo_secreto.AmigoSecreto.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name="sorteio_tb")
public class Sorteio {
    @Id
    @Column(name="sor_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(name="par_id")
    private UUID participanteID;

    @Column(name="par_sorteado_id")
    private UUID amigoSorteadoID;
}
