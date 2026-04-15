package com.jadirxavier.usuario.infrastructure.repository;

import com.jadir.aprendendo_javaspring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
