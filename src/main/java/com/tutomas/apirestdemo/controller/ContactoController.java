package com.tutomas.apirestdemo.controller;

import com.tutomas.apirestdemo.model.Contacto;
import com.tutomas.apirestdemo.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contactos")
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> getAll() {
        return contactoRepository.findAll();
    }

    @PostMapping
    public Contacto create(@RequestBody Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
