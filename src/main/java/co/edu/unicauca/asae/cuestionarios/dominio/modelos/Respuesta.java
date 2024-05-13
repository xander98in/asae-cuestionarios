package co.edu.unicauca.asae.cuestionarios.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Respuesta {

    private Integer idRespuesta;
    private String descripcion;
    private Docente objDocente;
    private Pregunta objPregunta;

    public Respuesta() {

    }
}
