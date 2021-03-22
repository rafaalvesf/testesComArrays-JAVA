package Classes;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        //O aluno deverá informar a quantidade de notas, os valores da nota e o programa imprimir a média.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de provas que foram realizadas: ");
        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite o valor da " + (i + 1) + "° nota: ");
            notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for(double nota:notas){
            total += nota;
        }
        double media = total / qtdNotas;
        System.out.println("O valor médio das notas, foram de: " + media);
        entrada.close();

    }
}
