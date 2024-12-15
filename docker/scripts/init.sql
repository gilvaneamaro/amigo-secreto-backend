CREATE TABLE participante_tb (
     par_id uuid primary key,
     par_nome VARCHAR NOT NULL,
     par_email VARCHAR(255) NOT NULL,
     par_cpf VARCHAR(11) UNIQUE

);

CREATE TABLE lista_desejo_tb (
    lis_id UUID PRIMARY KEY,
    lis_item VARCHAR(255),
    par_id uuid not null,
    FOREIGN KEY (par_id)  REFERENCES  participante_tb(par_id)
);


CREATE TABLE grupo_tb (
    gru_nome VARCHAR(100),
    gru_id UUID NOT NULL PRIMARY KEY,
    gru_dono UUID NOT NULL,
    FOREIGN KEY (gru_dono) REFERENCES participante_tb(par_id),
);

CREATE TABLE sorteio_tb (
    sor_id UUID NOT NULL PRIMARY KEY,
    par_id UUID NOT NULL,
    gru_id UUID NOT NULL,
    par_sorteado_id UUID NOT NULL,
    FOREIGN KEY (gru_id) REFERENCES grupo_tb(gru_id),
    FOREIGN KEY (par_id) REFERENCES participante_tb(par_id),
    FOREIGN KEY (par_sorteado_id) REFERENCES participante_tb(par_id)
);

CREATE TABLE grupo_participante_tb (
    gru_id UUID NOT NULL,
    par_id UUID NOT NULL,
    PRIMARY KEY (gru_id, par_id),
    FOREIGN KEY (gru_id) REFERENCES grupo_tb(gru_id),
    FOREIGN KEY (par_id) REFERENCES participante_tb(par_id)
);

