package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
    Long id;
    String nome;
    Integer matricula;
    String email;
}
