package br.com.ceuma.configuration.ceuma;


import br.com.ceuma.configuration.SpringConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"br.com.ceuma"})
@Import(SpringConfiguration.class)
@PropertySource({"classpath:application-production-ceuma.properties"})
public class CeumaProduction {


    @Bean(name = "IES")
    public String ies(){
        return new String("CEUMA PRODUÇAO");
    }
}
