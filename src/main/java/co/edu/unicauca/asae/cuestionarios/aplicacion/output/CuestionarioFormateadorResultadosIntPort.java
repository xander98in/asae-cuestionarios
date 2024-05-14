package co.edu.unicauca.asae.cuestionarios.aplicacion.output;

public interface CuestionarioFormateadorResultadosIntPort {

    public void retornarRespuestaErrorEntidadExiste(String mensaje);

    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
}