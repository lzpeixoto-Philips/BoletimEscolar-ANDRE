package org.example;
import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String situacao = "";

        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
            teclado.close();
            return;
        }

        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        if (nota2 < 0 || nota1 > 10) {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
            teclado.close();
            return;
        }

        System.out.println("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();
        if (nota3 < 0 || nota1 > 10) {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
            teclado.close();
            return;
        }

        double media = (nota1 + nota2 + nota3) / 3;

        
        if (media >= 7){
             situacao = "Aprovado!";
        }else if (media >= 5 || media < 7){
             situacao = "Recuperação!";
        }else if (media < 5){
            situacao = "Reprovado!";
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Notas : "+ "[" +nota1 + "]"+ "[" +nota2 + "]"+ "[" +nota3 + "]" );
        System.out.println("Media: " + media);
        System.out.println("Situação: " + situacao);

        teclado.close();
    }
}
