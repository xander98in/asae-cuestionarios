package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.controladores;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.cuestionarios.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.mappers.CuestionarioMapperInfraestructuraDominio;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cuestionarios")
@RequiredArgsConstructor
@Validated
public class CuestionarioRestController {

    private final GestionarCuestionarioCUIntPort objGestionarCuestionariosCUInt;
    private final CuestionarioMapperInfraestructuraDominio objMapeador;

    @PostMapping("/crear")
    public ResponseEntity<CuestionarioDTORespuesta> crearCuestionario(@Valid @RequestBody CuestionarioDTOPeticion objCuestionario) {

        Cuestionario objCuestionarioCrear = objMapeador.mappearDePeticionACuestionario(objCuestionario); 
        
        Cuestionario objCuestionarioCreado = objGestionarCuestionariosCUInt.crearCuestionario(objCuestionarioCrear);
        ResponseEntity<CuestionarioDTORespuesta> objRespuesta = new ResponseEntity<CuestionarioDTORespuesta>(
            objMapeador.mappearDeCuestionarioARespuesta(objCuestionarioCreado),
            HttpStatus.CREATED
        );
        return objRespuesta;
    }

    
    

}
