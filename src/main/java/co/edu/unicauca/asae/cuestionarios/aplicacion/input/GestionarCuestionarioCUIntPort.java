package co.edu.unicauca.asae.cuestionarios.aplicacion.input;

import java.util.List;

import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;

public interface GestionarCuestionarioCUIntPort {
    public Cuestionario crearCuestionario(Cuestionario objCuestionario);
    public List<Cuestionario> listarCuestionarios();
}
