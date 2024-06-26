package co.edu.unicauca.asae.cuestionarios.aplicacion.output;

import java.util.List;

import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;

public interface GestionarCuestionarioGatewayIntPort {

    public boolean existeCuestionarioPorTitulo(String titulo);

    public Cuestionario guardarCuestionario(Cuestionario objCuestionario);

    public List<Cuestionario> listarCuestionarios();
}
