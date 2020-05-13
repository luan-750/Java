package exercicios;

import java.util.Scanner;

/**
 * @author Luan Oliveira Santos
 *
 */

public class JoKenPow {

	public static void main(String[] args) {
		// Lógica do player
		int player;
		Scanner gesto = new Scanner(System.in);
		System.out.println("----------- JoKenPow------------");
		System.out.println("________________________________");
		System.out.println("Rgras do jogo");
		System.out.println("Você deve escolher entre: ");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite o número referente a sua escolha: ");
		player = gesto.nextInt();
		switch (player) {
		case 1:
			System.out.println("Você escolheu PEDRA");
			break;
		case 2:
			System.out.println("Você escolheu PAPEL");
			break;
		case 3:
			System.out.println("Você escolheu TESOURA");
			break;
		default:
			System.out.println("Comando inválido");
		}
		// Lógica do computador
		int cpu = (int) (Math.random() * 3 + 1);
		switch (cpu) {
		case 1:
			System.out.println("CPU escolheu PEDRA");
			break;
		case 2:
			System.out.println("CPU escolheu PAPEL");
			break;
		case 3:
			System.out.println("CPU escolheu TESOURA");
			break;
		}
		// Lógica para determinar o vencedor
		if ((player == 1 && cpu == 3) || (player == 2 && cpu == 1) || (player == 3 && cpu == 2)) {
			System.out.println("Você venceu");
		} else if ((player == 3 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 3)) {
			System.out.println("CPU venceu");
		} else {
			System.out.println("EMPATE");
		}
		gesto.close();
	}

}
