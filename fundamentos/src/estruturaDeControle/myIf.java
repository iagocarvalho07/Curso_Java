package estruturaDeControle;

import java.util.Scanner;

public class myIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a media:");
		double media = scanner.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Aprovado");
		}
		if(media < 7 && media >= 4.5) {
			System.out.println("recuperação");

		}
		if(media < 4.5 && media >= 0.0) {
			System.out.println("Reprovação");
		}
		scanner.close();
	}
}
