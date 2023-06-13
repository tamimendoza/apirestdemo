package com.tutomas.apirestdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private String telefono;
}
