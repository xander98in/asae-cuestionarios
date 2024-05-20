package co.edu.unicauca.asae.cuestionarios.dominio.casosDeUso;

import co.edu.unicauca.asae.cuestionarios.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.cuestionarios.aplicacion.output.CuestionarioFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;

public class GestionarCuestionarioCUAdapter implements GestionarCuestionarioCUIntPort {

    private final GestionarCuestionarioGatewayIntPort objGestionarCuestionarioGateway;
    private final CuestionarioFormateadorResultadosIntPort objCuestionarioFormateadorResultados;

    public GestionarCuestionarioCUAdapter(
        GestionarCuestionarioGatewayIntPort objRegistrarCuestionarioGateway,
        CuestionarioFormateadorResultadosIntPort objCuestionarioFormateadorResultados
    ) {
        this.objGestionarCuestionarioGateway = objRegistrarCuestionarioGateway;
        this.objCuestionarioFormateadorResultados = objCuestionarioFormateadorResultados;
    }

    @Override
    public Cuestionario crearCuestionario(Cuestionario objCuestionario) {

        Cuestionario objCuestionarioCreado = null;
        objCuestionarioCreado = this.objGestionarCuestionarioGateway.guardarCuestionario(objCuestionario);
        /* if(this.objGestionarCuestionarioGateway.existeCuestionarioPorTitulo(objCuestionario.getTitulo())) {
            this.objCuestionarioFormateadorResultados
                .retornarRespuestaErrorEntidadExistente("Error, se encuentra en el sistema un cuestionario con este titulo");
        }
        else{
            objCuestionarioCreado = this.objGestionarCuestionarioGateway.guardarCuestionario(objCuestionario);
        } */

        return objCuestionarioCreado;
    }

}
