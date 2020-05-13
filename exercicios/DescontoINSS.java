package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author luano Atividade tema livre -- Cálculo do desconto do INSS no salário
 */

public class DescontoINSS {

	public static void main(String[] args) {
		// Lógica do cálculo do INSS
		double salario;
		Scanner valorsal = new Scanner(System.in);
		System.out.println(
				"O cálculo é feito com a subtração de uma porcentagem do salário de acordo com o valor adquirido: ");
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println("O desconto é de 7,5% se você ganha até R$ 1045");
		System.out.println("O desconto é de 9% se você ganha entre R$1045,01 e R$2089,60");
		System.out.println("O desconto é de 12% se você ganha entre R$2089,61 e R$3134,41");
		System.out.println("O desconto é de 14% se você ganha entre R$3134,41 e R$6101,06");
		System.out.println(
				"________________________________________________________________________________________________");
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo do desconto do INSS: ");
		System.out.println("Digite seu sálario");
		salario = valorsal.nextDouble();
		if (salario <= 1045) {
			System.out.println("O valor do desconto do INSS no seu salário é: " + formatador.format(salario * 0.075));
		} else if (salario >= 1045.01 && salario <= 2089.60) {
			System.out.println("O valor do desconto do INSS no seu salário é: " + formatador.format(salario * 0.09));
		} else if (salario >= 2089.61 && salario <= 3134.41) {
			System.out.println("O valor do desconto do INSS no seu salário é: " +formatador.format(salario * 0.12));
		} else if (salario >= 3134.41 && salario <= 6101.06) {
			System.out.println("O valor do desconto do INSS no seu salário é: " +formatador.format(salario * 0.14));
		} else {
			System.out.println("Seu salário é superior a R$6106,01");
		}
		valorsal.close();
	}

}
