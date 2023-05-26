package br.edu.iftm.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
    BigDecimal valorImpostoDeRenda();
}
