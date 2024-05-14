package co.edu.unicauca.asae.cuestionarios.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.CuestionarioFormateadorResultadosIntPort;

@Service
public class CuestionarioFormateadorResultadosImplAdapter implements CuestionarioFormateadorResultadosIntPort {

    @Override
    public void retornarRespuestaErrorEntidadExistente(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarRespuestaErrorEntidadExistente'");
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarRespuestaErrorReglaDeNegocio'");
    }

}
