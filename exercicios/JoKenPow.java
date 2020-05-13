package exercicios;

import java.util.Scanner;

/**
 * @author Luan Oliveira Santos
 *
 */

public class JoKenPow {

	public static void main(String[] args) {
		// L�gica do player
		int player;
		Scanner gesto = new Scanner(System.in);
		System.out.println("----------- JoKenPow------------");
		System.out.println("________________________________");
		System.out.println("Rgras do jogo");
		System.out.println("Voc� deve escolher entre: ");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite o n�mero referente a sua escolha: ");
		player = gesto.nextInt();
		switch (player) {
		case 1:
			System.out.println("Voc� escolheu PEDRA");
			break;
		case 2:
			System.out.println("Voc� escolheu PAPEL");
			break;
		case 3:
			System.out.println("Voc� escolheu TESOURA");
			break;
		default:
			System.out.println("Comando inv�lido");
		}
		// L�gica do computador
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
		// L�gica para determinar o vencedor
		if ((player == 1 && cpu == 3) || (player == 2 && cpu == 1) || (player == 3 && cpu == 2)) {
			System.out.println("Voc� venceu");
		} else if ((player == 3 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 3)) {
			System.out.println("CPU venceu");
		} else {
			System.out.println("EMPATE");
		}
		gesto.close();
	}

}
