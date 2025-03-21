package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia {
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limites;

    public Data(String observacao, int ano, int mes, int dia, Map<Integer, Integer> limites) {
        super(observacao);
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limites = limites;
        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        if (novoAno < 1970) {
            novoAno = 1970;
            this.ano = novoAno;
        }
        if (novoMes < 1) {
            novoMes = 1;
        } else if (novoMes > 12) {
            novoMes = 12;
        }
        if (novoDia < 1) {
            novoDia = 1;
        } else {
            int c = 0;
            for (int i : limites.keySet()) {
                    c += limites.get(i);
                    if (novoMes == c) {
                        if (novoDia > limites.get(i)) {
                            novoDia = limites.get(i);
                        }
                    }
                }
        }

        this.mes = novoMes;
        this.dia = novoDia;
    }

    @Override
    public int comoInteiro() {
        int diasTotais = 0;
        for (int i = 1970; i < ano; i++) {
            diasTotais += 365;
        }
        for (int i = 1; i < mes; i++) {
            diasTotais += limites.get(i); //acessando o valor do dicionário referente a chave de indice i
        }

        diasTotais += -1;
        return diasTotais;
    }
}
