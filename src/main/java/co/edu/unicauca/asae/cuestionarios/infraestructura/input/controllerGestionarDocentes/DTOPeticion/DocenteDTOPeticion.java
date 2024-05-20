package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarDocentes.DTOPeticion;

import java.util.List;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.TelefonoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocenteDTOPeticion {
    private String correo;
    private String vinculacion;
    private TelefonoDTOPeticion objTelefono;
    private List<DepartamentoDTOPeticion> departamentos;
}
