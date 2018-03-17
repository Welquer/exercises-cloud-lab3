package com.disciplinasclient.disciplinasclient.models;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DisciplinaDTO {
    String nome;
    Integer cargaHoraria;
    Date dataInicio;
    List<String> alunosMatriculados;
}
