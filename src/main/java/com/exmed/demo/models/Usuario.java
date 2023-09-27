package com.exmed.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String codIndicacao; /*Gerar automaticamente um codigo para indicar outros usuarios*/
    private String codEntrada; /*Area para colocar o codigo de indicação*/
    private String nome;
    private char Sexo;
    private int idade;
    private String cpf;
    private int saldoExmedcoin;
    @Embedded
    private Endereco endereco;
    @Column(unique = true, nullable = false)
    private String email;
    private String senha; //Utilizar SpringSecurity
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;


}
