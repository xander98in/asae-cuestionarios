package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import co.edu.unicauca.asae.cuestionarios.dominio.modelos.TipoPregunta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PreguntaDTOPeticion {
    private String enunciado;
    private TipoPregunta objTipoPregunta;
}
