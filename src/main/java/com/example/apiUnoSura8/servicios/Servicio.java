package com.example.apiUnoSura8.servicios;

import com.example.apiUnoSura8.modelos.Usuario;
import com.example.apiUnoSura8.repositorios.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    //  Inyectando la dependencia del repositorio
    @Autowired
    Repositorio repositorio;


    //Servicio que guarda un usuarioo en BD

    public Usuario guardarUsuario(Usuario datos){
        return this.repositorio.save(datos);
    }

}
