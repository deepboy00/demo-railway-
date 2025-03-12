package com.ApiMySQL.AppDisco.repository;

import com.ApiMySQL.AppDisco.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
