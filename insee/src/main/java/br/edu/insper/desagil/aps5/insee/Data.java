package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;

public class Data extends Referencia {
    private int ano;
    private int mes;
    private int dia;
    private HashMap<Integer, Integer> limites;

    public Data(int ano, int mes, int dia) {
        super();
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;

        limites = new HashMap<>();
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


    public void atualiza(int ano, int mes, int dia) {
        if (ano < 1970) {
            this.ano = 1970;
        } else {
            this.ano = ano;
        }

        if (mes < 1) {
            this.mes = 1;
        } else if (mes > 12) {
            this.mes = 12;
        } else {
            this.mes = mes;
        }

        if (dia < 1) {
            this.dia = 1;
        } else {
            int limiteDoMes = limites.get(this.mes);
            if (dia > limiteDoMes) {
                this.dia = limiteDoMes;
            } else {
                this.dia = dia;
            }
        }
    }

    @Override
    public int comoInteiro() {
        int totalDias = 0;


        totalDias += (ano - 1970) * 365;


        for (int m = 1; m < mes; m++) {
            totalDias += limites.get(m);
        }


        totalDias += (dia - 1);

        return totalDias;
    }
}
