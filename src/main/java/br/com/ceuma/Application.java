package br.com.ceuma;

import br.com.ceuma.configuration.ceuma.CeumaProduction;
import br.com.ceuma.configuration.euro.EuroProduction;
import br.com.ceuma.configuration.famaz.FamazProduction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by markiing on 6/15/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(EuroProduction.class, args);
    }
}
