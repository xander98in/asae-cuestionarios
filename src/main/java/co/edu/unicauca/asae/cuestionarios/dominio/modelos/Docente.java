package co.edu.unicauca.asae.cuestionarios.dominio.modelos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Docente {

    private String correo;
    private String vinculacion;
    private Telefono objTelefono;
    private List<Departamento> departamentos;
    private List<Respuesta> respuestas;

    public Docente() {

    }
}
