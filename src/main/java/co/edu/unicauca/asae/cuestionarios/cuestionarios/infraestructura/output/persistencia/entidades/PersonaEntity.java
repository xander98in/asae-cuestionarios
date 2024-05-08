package co.edu.unicauca.asae.cuestionarios.cuestionarios.infraestructura.output.persistencia.entidades;


import co.edu.unicauca.asae.cuestionarios.cuestionarios.dominio.commons.enums.TipoIdentificacion;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

    @Enumerated(EnumType.STRING) // Mapea el enum como una cadena en la base de datos
    @Column(name = "tipo_identificacion", nullable = false, length = 30)
    private TipoIdentificacion tipoIdentificacion;

    @Column(name = "numero_identificacion", unique = true, nullable = true, length = 30)
    private String numeroIdentificacion;

    @Column(length = 30, nullable = false)
    private String nombres;

    @Column(length = 30, nullable = false)
    private String apellidos;

}
