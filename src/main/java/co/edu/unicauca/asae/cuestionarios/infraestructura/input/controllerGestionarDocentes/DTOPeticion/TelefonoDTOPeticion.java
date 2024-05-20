package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarDocentes.DTOPeticion;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.DocenteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TelefonoDTOPeticion {
    private String tipoTelefono;
    private String numero;
}
