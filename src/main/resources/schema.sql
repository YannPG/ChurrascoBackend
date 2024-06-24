CREATE TABLE tipo_comes_e_bebes
(
    id INTEGER AUTO_INCREMENT,
    descricao VARCHAR(20),

    CONSTRAINT id_tipo_alimento_pk PRIMARY KEY (id)
);


CREATE TABLE comes_e_bebes
(
    id UUID,
    descricao VARCHAR(50),
    valor DECIMAL(7,2),
    quantidade VARCHAR(50),
    id_tipo_alimento INTEGER,

    CONSTRAINT id_alimento_pk PRIMARY KEY(id),
    CONSTRAINT alimento_tipo_alimento_id_fk FOREIGN KEY(id_tipo_alimento) REFERENCES tipo_comes_e_bebes(id)
);

CREATE TABLE local
(
    id UUID,
    rua VARCHAR(40),
    numero VARCHAR(10),
    cep VARCHAR(9),
    cidade VARCHAR(30),
    estado VARCHAR(30),
    complemento VARCHAR(30),
    vagas_estacionamento INTEGER,
    limite_de_pessoas INTEGER,
    valor DECIMAL(5,2),

    CONSTRAINT id_local_pk PRIMARY KEY(id)
);

CREATE TABLE pessoa
(
    id INTEGER AUTO_INCREMENT,
    nome VARCHAR(50),
    situacao VARCHAR(20),
    telefone VARCHAR(15),
    locomocao VARCHAR(20),
    data_confirmacao VARCHAR(11),

    CONSTRAINT id_pessoa_pk PRIMARY KEY(id)
);

CREATE TABLE xhurrasco
(
    id INTEGER AUTO_INCREMENT,
    data_inicio TIMESTAMP,
    data_fim TIMESTAMP,
    anfitriao INTEGER,
    id_local UUID,

    CONSTRAINT id_churrasco_pk PRIMARY KEY(id),
    CONSTRAINT anfitriao_churrasco FOREIGN KEY(anfitriao) REFERENCES pessoa(id)
);



CREATE TABLE pessoa_alimento_xhurrasco
(
    id_pessoa INTEGER,
    id_alimento UUID,
    id_xhurrasco INTEGER,
    quantidade INTEGER,

    CONSTRAINT pessoa_id_fk FOREIGN KEY (id_pessoa) REFERENCES pessoa (id),
    CONSTRAINT alimento_id_fk FOREIGN KEY (id_alimento) REFERENCES comes_e_bebes (id),
    CONSTRAINT xhurrasco_id_fk FOREIGN KEY (id_xhurrasco) REFERENCES xhurrasco (id)
);