package classes;

import java.util.Scanner;

public class Ponto {
    private int x; // ponto x
    private int y; // ponto y

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void PreencherPonto() {
        Scanner ler = new Scanner(System.in);
        System.out.println(" Defina um valor para o ponto X: ");
        this.x = ler.nextInt();

        System.out.println(" Defina um valor para o ponto Y: ");
        this.y = ler.nextInt();
    }

    public void ImprimirCoordenadas() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public double distancia(Ponto outro) {
        return Math.sqrt(Math.pow(outro.x - this.x, 2) + Math.pow(outro.y - this.y, 2));
    }
}
