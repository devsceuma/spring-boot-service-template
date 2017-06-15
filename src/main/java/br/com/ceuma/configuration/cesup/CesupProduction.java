package br.com.ceuma.configuration.cesup;

import br.com.ceuma.configuration.SpringConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"br.com.ceuma"})
@Import(SpringConfiguration.class)
@PropertySource({"classpath:application-production-cesup.properties"})
public class CesupProduction {

    @Bean(name = "IES")
    public String ies(){
        return new String("CESUP");
    }
}
