package prova8S2;

import java.util.Scanner;

public class Main {
	private static String A = "";
	private static String B = "";	

	private static Integer GerarC(String numeroA, String numeroB) {
		String C = "";

		int limite = Math.max(numeroA.length(), numeroB.length());
		for (int i = 0; i <= limite; i++) {
			if (i < numeroA.length()) {
				C += numeroA.charAt(i);
			}
			if (i < numeroB.length()) {
				C += numeroB.charAt(i);
			}
		}
		return C.length() > 6 ? -1 : Integer.valueOf(C.toString());
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			boolean passou = true;
			while (passou) {
				System.out.printf("Digite o Valor de A:");
				A = s.nextLine();
				try {
					Integer.parseInt(A);
					passou = false;
				} catch (Exception e) {
					System.out.println("Informe um Numero Inteiro:");
					passou = true;
				}
			}
			passou = true;
			while (passou) {			
				System.out.printf("Digite o Valor de B:");
				B = s.nextLine();
				try {
					Integer.parseInt(B);
					passou = false;
				} catch (Exception e) {
					System.out.println("Informe um Numero Inteiro:");
					passou = true;
				}
			}
			System.out.println("O Valor de C é:" + GerarC(A, B));
			System.out.println("Deseja Continuar? (Digite 'S' Para continuar!)");			
		} while (s.nextLine().equals("S"));
	}
}
