package co.edu.unicauca.asae.cuestionarios.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pregunta {

    private Integer idPregunta;
    private String enunciado;
    private List<Respuesta> respuestas;
    private Cuestionario objCuestionario;
    private TipoPregunta objTipoPregunta;

    public Pregunta() {

    }
}
