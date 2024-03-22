package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		double notasvalidas = 0;
		double userImput = 0.0;
		while(userImput != -1) {
			System.out.println("Digite a nota do aluno, ou digite -1 para finalizar o programa");
			userImput = Double.parseDouble(scanner.nextLine().replace(",", "."));
			if(userImput >= 0 && userImput <=10 && userImput != -1) {
				total++;
				notasvalidas += userImput;
			}else {
				System.out.println("Digite uma nota Valida: entre 0 a 10 ");
			}
		}
		double media = notasvalidas / total;
		System.out.println("A media de notas De todos os alunos é igual a:" + media);
	}
}
