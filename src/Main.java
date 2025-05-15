import classes.Ponto;
import classes.Quadrado;
import classes.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static int ImprimirMenu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println(" 1 - Preencher Coordenadas ");
        System.out.println(" 2 - Imprimir Coordenadas   ");
        System.out.println(" 3 - Distância entre dois pontos ");
        System.out.println(" 4 - Pontos são colineares?   ");
        System.out.println(" 5 - Forma um triângulo? Se sim, calcular área do triângulo, perímetro e o seu tipo ");
        System.out.println(" 6 - Forma um Quadrado? Se sim, calcular área do quadrado, perímetro e o seu tipo ");
        System.out.println(" 0 - Sair ");
        System.out.println("--------------------------------");
        System.out.print("Escolha uma opção: ");
        return ler.nextInt();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Ponto> listaPontos = new ArrayList<Ponto>();

        int opcao;

        do {
            opcao = ImprimirMenu();

            if (opcao == 1) {
                // Preencher coordenadas
                Ponto p1 = new Ponto();
                System.out.println("Informe os valores de X e Y:");
                p1.PreencherPonto();
                listaPontos.add(p1);

            } else if (opcao == 2) {
                // Imprimir coordenadas
                if (listaPontos.isEmpty()) {
                    System.out.println("Nenhum ponto cadastrado.");
                } else {
                    for (int i = 0; i < listaPontos.size(); i++) {
                        System.out.print(" Coordenadas " + (i + 1) + ": ");
                        listaPontos.get(i).ImprimirCoordenadas();
                    }
                }

            } else if (opcao == 3) {
                // Calcular distância entre dois pontos
                if (listaPontos.size() >= 2) {
                    for (int i = 0; i < listaPontos.size() - 1; i++) {
                        double distancia = listaPontos.get(i).distancia(listaPontos.get(i + 1));
                        System.out.printf("Distância entre os pontos (%d, %d) e (%d, %d): %.2f\n",
                                listaPontos.get(i).getX(), listaPontos.get(i).getY(),
                                listaPontos.get(i + 1).getX(), listaPontos.get(i + 1).getY(),
                                distancia);
                    }
                } else {
                    System.out.println("A lista não tem pontos suficientes (mínimo: 2).");
                }

            } else if (opcao == 4) {
                // Verificar colinearidade
                if (listaPontos.size() >= 3) {
                    Triangulo t = new Triangulo(listaPontos.get(0), listaPontos.get(1), listaPontos.get(2));
                    if (t.isColineares()) {
                        System.out.println("Os pontos são colineares.");
                    } else {
                        System.out.println("Os pontos não são colineares.");
                    }
                } else {
                    System.out.println("A lista não possui 3 pontos, não é possível verificar colinearidade.");
                }

            } else if (opcao == 5) {
                // Calcular área do triângulo
                if (listaPontos.size() >= 3) {
                    Triangulo t = new Triangulo(listaPontos.get(0), listaPontos.get(1), listaPontos.get(2));


                    System.out.println(" Sim, é um triângulo porque possui 3 pontos  ");
                    t.imprimirTriangulo();
                }

            } else if (opcao == 6) {
                if (listaPontos.size() >= 4) {
                    Quadrado q = new Quadrado(listaPontos.get(0), listaPontos.get(1), listaPontos.get(2), listaPontos.get(3));

                    System.out.println(" Os pontos formam um quadrado ");
                    q.imprimirQuadrado();
                }else{
                    System.out.println(" Não é um quadrado, pois não possui 4 pontos ");
                }
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opção inválida!");
            }


        } while (opcao != 0);
    }
}


