package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// <ctrl><shift><f> (alinhamento do código)
		// Variaveis
		double nota1, nota2, media;
		// Objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		// Objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.0");
        System.out.println("Cálculo da média");
        //entrada
        System.out.println("Digite a nota1:");
        nota1= leitor.nextDouble();
        System.out.print("Digite a nota2:");
        nota2 = leitor.nextDouble();
        //Processamento
        media = (nota1 + nota2) / 2;
        //Saída
        System.out.println("Média: " + formatador.format(media));
        if (media < 2) {
        	System.out.println("Reprovado");
        }else if (media >= 2 && media < 5) {
        	System.out.println("Recuperação");
        }else {
        	System.out.println("Aprovado");
        }
        leitor.close();
	}
}