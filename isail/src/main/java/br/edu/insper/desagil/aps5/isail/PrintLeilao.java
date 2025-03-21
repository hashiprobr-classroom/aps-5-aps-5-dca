package br.edu.insper.desagil.aps5.isail;

public class LeilaoPrinter {
    public static void imprimeMelhoresLances(Leilao leilao) {
        for (Item item : leilao.getItems()) {
            item.imprimeMelhorLance();
        }
    }
}