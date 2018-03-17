package com.alunosclient.alunosclient.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue
    Long id;
    String nome;
    Integer matricula;
    String email;
}
