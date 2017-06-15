package br.com.ceuma.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by markiing on 6/15/17.
 */

@JsonAutoDetect
public class Response {

    @JsonProperty
    private Integer codigo;

    @JsonProperty
    private String mensagem;

    public Response(Integer codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }
}
