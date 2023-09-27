package com.exmed.demo.models;

import jakarta.persistence.*;

import java.util.Date;

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    private String nome;
    private String email;
    private String senha;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

}
