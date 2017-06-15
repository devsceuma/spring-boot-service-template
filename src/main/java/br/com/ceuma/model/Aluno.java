package br.com.ceuma.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Aluno {

    private Integer codigo;

    @JsonProperty
    private String nome;

    @JsonProperty
    private String cpf;

    public Aluno(Integer codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }
}
