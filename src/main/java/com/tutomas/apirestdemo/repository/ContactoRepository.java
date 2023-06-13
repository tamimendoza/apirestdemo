package com.tutomas.apirestdemo.repository;

import com.tutomas.apirestdemo.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
