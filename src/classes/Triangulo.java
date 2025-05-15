package classes;

public class Triangulo {
    private Ponto p1, p2, p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean isColineares() {
        double det = p1.getX() * (p2.getY() - p3.getY())
                - p2.getX() * (p1.getY() - p3.getY())
                + p3.getX() * (p1.getY() - p2.getY());
        return det == 0;
    }

    public double area() {
        return Math.abs(
                p1.getX() * (p2.getY() - p3.getY())
                        + p2.getX() * (p3.getY() - p1.getY())
                        + p3.getX() * (p1.getY() - p2.getY())
        ) / 2.0;
    }

    public double perimetro() {
        return p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);
    }
    public void tipoTriangulo (){

        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p1);

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O Triângulo é equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O Triângulo é isósceles");
        } else {
            System.out.println("O Triângulo é escaleno");
        }


    }

    public void imprimirTriangulo (){

        System.out.println(" A área do triângulo é: " +area());
        System.out.println( " São colineares: "+isColineares());
        System.out.println( " O perímetro do triângulo é: " +perimetro());
        tipoTriangulo();


    }

}

