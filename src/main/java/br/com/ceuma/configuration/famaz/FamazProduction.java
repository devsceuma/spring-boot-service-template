package br.com.ceuma.configuration.famaz;

import br.com.ceuma.configuration.SpringConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"br.com.ceuma"})
@Import(SpringConfiguration.class)
@PropertySource({"classpath:application-production-famaz.properties"})
public class FamazProduction {

    @Bean(name = "IES")
    public String ies(){
        return new String("FAMAZ");
    }
}
