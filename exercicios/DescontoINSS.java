package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author luano Atividade tema livre -- C�lculo do desconto do INSS no sal�rio
 */

public class DescontoINSS {

	public static void main(String[] args) {
		// L�gica do c�lculo do INSS
		double salario;
		Scanner valorsal = new Scanner(System.in);
		System.out.println(
				"O c�lculo � feito com a subtra��o de uma porcentagem do sal�rio de acordo com o valor adquirido: ");
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println("O desconto � de 7,5% se voc� ganha at� R$ 1045");
		System.out.println("O desconto � de 9% se voc� ganha entre R$1045,01 e R$2089,60");
		System.out.println("O desconto � de 12% se voc� ganha entre R$2089,61 e R$3134,41");
		System.out.println("O desconto � de 14% se voc� ganha entre R$3134,41 e R$6101,06");
		System.out.println(
				"________________________________________________________________________________________________");
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("C�lculo do desconto do INSS: ");
		System.out.println("Digite seu s�lario");
		salario = valorsal.nextDouble();
		if (salario <= 1045) {
			System.out.println("O valor do desconto do INSS no seu sal�rio �: " + formatador.format(salario * 0.075));
		} else if (salario >= 1045.01 && salario <= 2089.60) {
			System.out.println("O valor do desconto do INSS no seu sal�rio �: " + formatador.format(salario * 0.09));
		} else if (salario >= 2089.61 && salario <= 3134.41) {
			System.out.println("O valor do desconto do INSS no seu sal�rio �: " +formatador.format(salario * 0.12));
		} else if (salario >= 3134.41 && salario <= 6101.06) {
			System.out.println("O valor do desconto do INSS no seu sal�rio �: " +formatador.format(salario * 0.14));
		} else {
			System.out.println("Seu sal�rio � superior a R$6106,01");
		}
		valorsal.close();
	}

}
