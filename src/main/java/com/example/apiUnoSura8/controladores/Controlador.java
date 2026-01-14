package com.example.apiUnoSura8.controladores;


import com.example.apiUnoSura8.modelos.Usuario;
import com.example.apiUnoSura8.servicios.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alejandro/usuarios")
public class Controlador {

    //Inyectando la dependencia al servicio
    @Autowired
    Servicio servicio;

    @PostMapping
    public ResponseEntity<?>guardar(@RequestBody Usuario datos){
        try {

         return ResponseEntity.status(HttpStatus.OK).body(this.servicio.guardarUsuario(datos));

        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }

}
