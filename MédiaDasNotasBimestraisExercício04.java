package ListaDeExerc�cios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Renner Alves Martins. Este programa recebe as quatros notas
 *         bimestrais de um aluno e imprime na tela a m�dia delas.
 */

public class M�diaDasNotasBimestraisExerc�cio04 {

	public static void main(String[] args) {

		String mensagem = null;
		int numerosCorretos = 0;
		int contador = 1;
		double[] sequenciaNumerica = new double[4];
		double soma = 0;

		while (numerosCorretos != 4) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Insira a " + contador + "� nota: ");

			try {
				double numero = scanner.nextDouble();
				contador++;
				for (int i = 0; i < sequenciaNumerica.length; i++) {
					if (i == numerosCorretos) {
						sequenciaNumerica[i] = numero;
					}
				}
				numerosCorretos++;
			} catch (InputMismatchException ex) {
				mensagem = ("Erro! Insira um valor v�lido.");
				System.out.println("Se for decimal, fa�a a " + "separa��o das casas decimais com v�rgula.");
				System.out.println(mensagem);

			}
		}
		System.out.println();
		System.out.println("Os n�meros que voc� digitou foram:");
		System.out.println();

		for (int i = 0; i < sequenciaNumerica.length; i++) {
			System.out.print(sequenciaNumerica[i] + " ");
		}
		System.out.println();
		System.out.print("A m�dia desses valores �: ");

		for (int i = 0; i < sequenciaNumerica.length; i++) {
			soma += sequenciaNumerica[i];

		}
		System.out.println(soma/4);
	}
}

