package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.gateway;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Pregunta;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.TipoPregunta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.CuestionarioEntity;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.TipoPreguntaEntity;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios.CuestionarioRepositoryInt;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios.TipoPreguntaRepositoryInt;

@Service
public class GestionarCuestionarioGatewayImplAdapter implements GestionarCuestionarioGatewayIntPort {

    private final CuestionarioRepositoryInt cuestionarioRepositoryInt;
    private final TipoPreguntaRepositoryInt tipoPreguntaRepositoryInt;
    private final ModelMapper cuestionarioModelMapper;

    public GestionarCuestionarioGatewayImplAdapter(CuestionarioRepositoryInt cuestionarioRepositoryInt,
            TipoPreguntaRepositoryInt tipoPreguntaRepositoryInt,
            ModelMapper cuestionarioModelMapper) {
        this.cuestionarioRepositoryInt = cuestionarioRepositoryInt;
        this.tipoPreguntaRepositoryInt = tipoPreguntaRepositoryInt;
        this.cuestionarioModelMapper = cuestionarioModelMapper;
    }

    @Override
    public boolean existeCuestionarioPorTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existeCuestionarioPorTitulo'");
    }

    @Override
    public Cuestionario guardarCuestionario(Cuestionario objCuestionario) {

        Cuestionario objCuestionarioNuevo = new Cuestionario();
        objCuestionarioNuevo.setTitulo(objCuestionario.getTitulo());
        objCuestionarioNuevo.setDescripcion(objCuestionario.getDescripcion());

    

        List<Pregunta> preguntasCuestionarioNuevo = new ArrayList<Pregunta>();
        for(Pregunta preguntaCuestionario: objCuestionario.getPreguntas()) {
            
            Pregunta pregunta = new Pregunta();
            pregunta.setEnunciado(preguntaCuestionario.getEnunciado());

            TipoPregunta tipoPreguntaConsultar = preguntaCuestionario.getObjTipoPregunta(); 
            Optional<TipoPreguntaEntity> optionalTipoPregunta = this.tipoPreguntaRepositoryInt.findById(tipoPreguntaConsultar.getIdTipoPregunta());
            TipoPreguntaEntity tipoPreguntaEntity = optionalTipoPregunta.get();
            TipoPregunta tipoPregunta = this.cuestionarioModelMapper.map(tipoPreguntaEntity, TipoPregunta.class);

            pregunta.setObjTipoPregunta(tipoPregunta);
            pregunta.setObjCuestionario(objCuestionarioNuevo);
            preguntasCuestionarioNuevo.add(pregunta);
        }

        objCuestionarioNuevo.setPreguntas(preguntasCuestionarioNuevo);
        System.out.println("--- " + objCuestionarioNuevo.getTitulo());
        System.out.println("--- " + objCuestionarioNuevo.getDescripcion());
        System.out.println("--- " + objCuestionarioNuevo.getPreguntas().size());
        System.out.println("--- " + objCuestionarioNuevo.getPreguntas().get(0).getEnunciado());
        System.out.println("--- " + objCuestionarioNuevo.getPreguntas().get(1).getObjTipoPregunta().getIdTipoPregunta());
        System.out.println("--- " + objCuestionarioNuevo.getPreguntas().get(1).getObjTipoPregunta().getNombre());
        CuestionarioEntity objCuestionarioEntity = this.cuestionarioModelMapper.map(objCuestionarioNuevo, CuestionarioEntity.class);
        System.out.println("Titulo cuestionario: " + objCuestionarioEntity.getTitulo());
        System.out.println("Descripcion del cuestionario: " + objCuestionarioEntity.getDescripcion());
        System.out.println("Preguntas: " + objCuestionarioEntity.getPreguntas().size());
        System.out.println("--- " + objCuestionarioEntity.getPreguntas().get(0).getEnunciado());
        System.out.println("--- " + objCuestionarioEntity.getPreguntas().get(1).getObjTipoPregunta().getIdTipoPregunta());
        System.out.println("--- " + objCuestionarioEntity.getPreguntas().get(1).getObjTipoPregunta().getNombre());

        CuestionarioEntity objCuestionarioEntityRegistrado = this.cuestionarioRepositoryInt.save(objCuestionarioEntity);
        Cuestionario objCuestionarioRespuesta = this.cuestionarioModelMapper.map(objCuestionarioEntityRegistrado, Cuestionario.class);

        return objCuestionarioRespuesta;
    }

    @Override
    public List<Cuestionario> listarCuestionarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarCuestionarios'");
    }

}
