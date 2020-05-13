package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Luan Oliveira Santos
 *
 */

public class IMC {

	public static void main(String[] args) {
		// Variaveis
		double peso, altura, resultado;
		//Leitor
		Scanner leitor = new Scanner(System.in);
		//Formatador
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo do IMC");
		//Entrada
		System.out.println("Digite seu peso");
		peso= leitor.nextDouble();
		System.out.println("Digite sua altura");
		altura= leitor.nextDouble();
		//Processamento
		resultado= peso / (altura * altura);
		//Saída 
		System.out.println("Seu IMC: " + formatador.format(resultado));
		if(resultado < 18.5) {
			System.out.println("Abaixo do peso");
		}else if (resultado > 40){
			System.out.println("Obesidadde grau 3");
		}else if (resultado >= 35 && resultado <=39) {
			System.out.println("Obesidade grau 2");
		}else if (resultado >= 30 && resultado <= 34.9) {
			System.out.println("Obesidade grau 1");
		}else if (resultado >= 25 && resultado <= 29.9) {
			System.out.println("Sobrepeso");
		}else {
			System.out.println("Peso ideal");
		}
		leitor.close();
	}

}
