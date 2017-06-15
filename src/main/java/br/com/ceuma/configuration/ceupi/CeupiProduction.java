package br.com.ceuma.configuration.ceupi;

import br.com.ceuma.configuration.SpringConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"br.com.ceuma"})
@Import(SpringConfiguration.class)
@PropertySource({"classpath:application-production-ceupi.properties"})
public class CeupiProduction {

    @Bean(name = "IES")
    public String ies(){
        return new String("CEUPI");
    }
}
