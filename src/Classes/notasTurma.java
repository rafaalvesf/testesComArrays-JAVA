package Classes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class notasTurma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Digite a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double[][] turma = new double[qtdAlunos][qtdNotas];

        int total = 0;

        for (int a = 0; a < qtdAlunos; a++) {
            for (int n = 0; n < qtdNotas; n++) {
                System.out.printf("Digite a nota %d° do %d° aluno: ", n + 1, a + 1);
                turma[a][n] = entrada.nextDouble();
                total += turma[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média das notas da turma foi de: " + media);

        for(double[]turmaArray: turma) {
            System.out.println(Arrays.toString(turmaArray));
        }
        entrada.close();

    }
}
