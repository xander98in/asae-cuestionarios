package co.edu.unicauca.asae.cuestionarios.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.CuestionarioFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.casosDeUso.GestionarCuestionarioCUAdapter;

@Configuration
public class BeanConfigurations {

    @Bean
    GestionarCuestionarioCUAdapter crearGestionarCuestionarioCUInt(
        GestionarCuestionarioGatewayIntPort objGestionarCuestionarioGateway,
        CuestionarioFormateadorResultadosIntPort objCuestionarioFormateadorResultados

    ) {
        GestionarCuestionarioCUAdapter objGestionarCuestionarioCU = new GestionarCuestionarioCUAdapter(objGestionarCuestionarioGateway,
            objCuestionarioFormateadorResultados);
        return objGestionarCuestionarioCU;
    }

}
