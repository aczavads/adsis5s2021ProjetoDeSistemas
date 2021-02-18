package br.unicesumar.aula20210218.dependênciaVersusAssociação;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor {
    private BigDecimal salário;
    private List<Disciplina> disciplinas = new ArrayList<>();


    public Professor() {
        PlanoCargosSalários plano = new PlanoCargosSalários();
        salário = plano.getPisoSalarialProfessor();
    }
    
}
