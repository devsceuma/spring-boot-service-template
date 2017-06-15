package br.com.ceuma.configuration.euro;


import br.com.ceuma.configuration.SpringConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"br.com.ceuma"})
@Import(SpringConfiguration.class)
@PropertySource({"classpath:application-production-euro.properties"})
public class EuroProduction {

    @Bean(name = "IES")
    public String ies(){
        return new String("UNIEURO");
    }
}
