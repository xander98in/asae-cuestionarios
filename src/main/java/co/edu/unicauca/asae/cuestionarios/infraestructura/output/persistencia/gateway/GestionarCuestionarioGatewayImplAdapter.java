package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.gateway;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Pregunta;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.TipoPregunta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.CuestionarioEntity;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.TipoPreguntaEntity;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios.CuestionarioRepositoryInt;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios.TipoPreguntaRepositoryInt;

@Service
@Transactional
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
    @Transactional
    public Cuestionario guardarCuestionario(Cuestionario objCuestionario) {

        CuestionarioEntity objCuestionarioEntity = this.cuestionarioModelMapper.map(objCuestionario, CuestionarioEntity.class);
        objCuestionarioEntity.getPreguntas().forEach(p -> p.setObjCuestionario(objCuestionarioEntity)); 
        objCuestionarioEntity.getPreguntas().forEach(p -> p.setObjTipoPregunta(
            this.tipoPreguntaRepositoryInt.findById(p.getObjTipoPregunta().getIdTipoPregunta()).get()));
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
