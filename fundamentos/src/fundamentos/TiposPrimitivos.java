package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionario
		
		// tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		float  salario = 11_455.144F;
		double vendasAcumulaas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false; // true
		char statys = 'a';
		
		
		//dias de empresa
		System.out.println("o funcionario tem"+ anosDeEmpresa * 365 + "dias trabalhando nessa empresa");
		System.out.println(numeroDeVoos);
		System.out.println(id);

		System.out.println(pontosAcumulados);

		System.out.println(salario);

		System.out.println(vendasAcumulaas);

		System.out.println(estaDeFerias);

		System.out.println(statys);

	}

}
