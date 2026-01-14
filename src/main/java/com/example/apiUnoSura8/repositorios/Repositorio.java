package com.example.apiUnoSura8.repositorios;

import com.example.apiUnoSura8.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Repositorio extends JpaRepository<Usuario,Integer> {
}
