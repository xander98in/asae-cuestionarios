package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class CuestionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuestionario")
    private Integer idCuestionario;

    @Column(length = 90, nullable = false)
    private String titulo;

    @Column(length = 90)
    private String descripcion;

    @OneToMany(cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, 
        fetch = FetchType.EAGER, mappedBy = "objCuestionario")
    private List<PreguntaEntity> preguntas;

}
