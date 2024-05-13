package co.edu.unicauca.asae.cuestionarios.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.ProductoFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadYaExisteException;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.controladorExcepciones.excepcionesPropias.ReglaNegocioExcepcion;

@Service
public class ProductoFormateadorResultadosImplAdapter implements ProductoFormateadorResultadosIntPort {

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        EntidadYaExisteException objException = new EntidadYaExisteException(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        ReglaNegocioExcepcion objException = new ReglaNegocioExcepcion(mensaje);
        throw objException;
    }

}