package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String valor = "";
		while (!valor.equalsIgnoreCase("sair")) {
			 System.out.println("para encerrar o programa digite: sair");
			 valor = scanner.nextLine();
		}
		scanner.close();
	}
}
