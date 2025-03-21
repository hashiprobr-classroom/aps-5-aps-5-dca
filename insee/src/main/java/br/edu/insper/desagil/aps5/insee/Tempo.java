package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia {
    private int hora;
    private int minuto;

    public Tempo(String observacao, int hora, int minuto) {
        super(observacao);
        this.hora = 0;
        this.minuto = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void atualiza(int nova_hora, int novo_minuto) {
        if (nova_hora < 0) {
            nova_hora = 0;
        } else if (nova_hora > 23) {
            nova_hora = 23;
        }
        if (novo_minuto < 0) {
            novo_minuto = 0;
        } else if (novo_minuto > 59) {
            novo_minuto = 59;
        }
        this.minuto = novo_minuto;
        this.hora = nova_hora;
    }


    @Override
    public int comoInteiro() {
        int minutosTotais = 0;
        minutosTotais = hora * 60 + minuto;
        return minutosTotais;

    }


}
