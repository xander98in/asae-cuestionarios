package co.edu.unicauca.asae.cuestionarios.dominio.casosDeUso;

import java.util.List;

import co.edu.unicauca.asae.cuestionarios.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.cuestionarios.aplicacion.output.CuestionarioFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;

public class GestionarCuestionarioCUAdapter implements GestionarCuestionarioCUIntPort {

    private final GestionarCuestionarioGatewayIntPort objGestionarCuestionarioGateway;
    private final CuestionarioFormateadorResultadosIntPort objCuestionarioFormateadorResultados;

    public GestionarCuestionarioCUAdapter(GestionarCuestionarioGatewayIntPort objRegistrarCuestionarioGateway,
            CuestionarioFormateadorResultadosIntPort objCuestionarioFormateadorResultados) {
        this.objGestionarCuestionarioGateway = objRegistrarCuestionarioGateway;
        this.objCuestionarioFormateadorResultados = objCuestionarioFormateadorResultados;
    }

    @Override
    public Cuestionario crearCuestionario(Cuestionario objCuestionario) {
        Cuestionario objCuestionarioCreado = null;
        if (this.objGestionarCuestionarioGateway.existeCuestionarioPorTitulo(objCuestionario.getTitulo())) {
            this.objCuestionarioFormateadorResultados
                    .retornarRespuestaErrorEntidadExiste(
                            "Error, se encuentra en el sistema un Cuestionario con el mismo titulo");
        } else {
            objCuestionarioCreado = this.objGestionarCuestionarioGateway.crearCuestionario(objCuestionario);
        }
        return objCuestionarioCreado;
    }

    @Override
    public List<Cuestionario> listarCuestionarios() {
        List<Cuestionario> listaObtenida = objGestionarCuestionarioGateway.listarCuestionarios();
        return listaObtenida;
    }

}