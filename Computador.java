package Aula01;

public class Computador {
    String nome;
    int clock;

    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.nome = "Pedro";
        computador.clock = 1200;

        System.out.println("Nome: " + computador.nome);
        System.out.println("Clock: " + computador.clock);
    }
}
