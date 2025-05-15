package classes;

public class Quadrado {
    private Ponto p1, p2, p3 , p4 ;


    public Quadrado(Ponto p1 , Ponto p2 , Ponto p3 , Ponto p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    private double produtoEscalar(Ponto p1, Ponto p2, Ponto p3) {
        double v1x = p2.getX() - p1.getX();
        double v1y = p2.getY() - p1.getY();
        double v2x = p3.getX() - p2.getX();
        double v2y = p3.getY() - p2.getY();
        return v1x * v2x + v1y * v2y;
    }

    public double Hipotenusa(){
        double hipotenusa = p1.distancia(p2); //calculando a distancia entre dois pontos, encontro a hipotenusa

        return hipotenusa;
    }

    public double areaQuadrado(){
        double lado_qudrado = Math.pow(Hipotenusa(),2); //elevando a Hipotenusa ao quadrado eu encontro a área

        return lado_qudrado;
    }

    public double perimetroQuadrado(){

        double perimeto_quadrado = 4 * Hipotenusa(); //multiplicando o lado do qudrado por 4, encontro o perimetro


        return perimeto_quadrado;

    }
    public void tipoQuadrado() {
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p4);
        double lado4 = p4.distancia(p1);

        boolean ladosIguais = lado1 == lado2 && lado2 == lado3 && lado3 == lado4;

        // Produto escalar entre dois vetores adjacentes (p1->p2 e p2->p3)
        double escalar = produtoEscalar(p1, p2, p3);
        boolean anguloReto = escalar == 0;

        if (ladosIguais && anguloReto) {
            System.out.println("É um quadrado");
        } else if (!ladosIguais && anguloReto) {
            System.out.println("É um retângulo");
        } else if (ladosIguais && !anguloReto) {
            System.out.println("É um losango");
        } else {
            System.out.println("Não é um quadrado, retângulo ou losango padrão");
        }


    }

    public void imprimirQuadrado(){

        System.out.println( " O lado do quadrado é: " + Hipotenusa());
        System.out.println( " A área do quadrado é: " + areaQuadrado());
        System.out.println(" O perímetro do quadrado é: " +perimetroQuadrado());
        tipoQuadrado(); //imprimir o tipo do quadrado na tela

    }


    }


