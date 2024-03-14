package fundamentos;

import java.util.Scanner;

public class TemperatureConverterPrimeiroDesafio {
	public static void main(String[] args) {
	
		System.out.print("Informe uma temperatura em fahrenheit: ");

		Scanner ler = new Scanner(System.in);
		double temperatura =  ler.nextDouble();		
		double temperaturaCelcius = (temperatura - 32) * 5/9;
		System.out.println("A temperatura em C° e igual a "+ temperaturaCelcius);
	}

}
