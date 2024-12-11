CREATE TABLE participante_tb (
     par_id uuid primary key,
     par_nome VARCHAR,
     par_email VARCHAR,
     par_cpf VARCHAR unique

);

CREATE TABLE lista_desejo_tb (
     lis_id UUID PRIMARY KEY,
     lis_item VARCHAR NOT NULL
);


CREATE TABLE participante_lista_tb (
    par_id UUID NOT NULL,
    lis_id UUID NOT NULL,
    PRIMARY KEY (par_id, lis_id),
    FOREIGN KEY (par_id) REFERENCES participante_tb(par_id),
    FOREIGN KEY (lis_id) REFERENCES lista_desejo_tb(lis_id)
);

CREATE TABLE sorteio_tb (
    sor_id UUID NOT NULL,
    par_id UUID NOT NULL,
    par_sorteado_id UUID NOT NULL,
    PRIMARY KEY (sor_id),
    FOREIGN KEY (par_id) REFERENCES participante_tb(par_id),
    FOREIGN KEY (par_sorteado_id) REFERENCES participante_tb(par_id)
);
