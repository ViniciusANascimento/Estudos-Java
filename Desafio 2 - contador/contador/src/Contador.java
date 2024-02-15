import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
            System.err.println("O Segundo par�metro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm)
        {
            throw new ParametrosInvalidosException("O Segundo par�metro deve ser maior que o primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
            for (int x = 0; x <= contagem; x++)
            {
                System.err.println("Imprimindo o n�mero " + x); 
            }
	}
}
