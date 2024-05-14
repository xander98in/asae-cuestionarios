package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MapperBean {
    
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper objMapper = new ModelMapper();
        objMapper.getConfiguration().setAmbiguityIgnored(true);
        return objMapper;
    }
}
