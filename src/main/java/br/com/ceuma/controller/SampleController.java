package br.com.ceuma.controller;

import br.com.ceuma.model.Aluno;
import br.com.ceuma.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sampleController")
public class SampleController {

    @Autowired
    @Qualifier("IES")
    private String ies;

    @RequestMapping(value = "/teste", method = RequestMethod.GET, produces = {"application/json"})
    public void teste(){
        System.out.println(String.format("Rodando no contexto -> %s",ies));
    }
}
