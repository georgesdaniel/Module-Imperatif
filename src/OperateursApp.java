

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner questionUser = new Scanner(System.in);
		System.out.print("Veuillez saisir un chiffre :");
		int a = questionUser.nextInt();
		
		System.out.print("Veuillez saisir un second chiffre :");
		int b = questionUser.nextInt();
		
		System.out.println("Le résultat de " +a+ "+" +b+ " est " + (a+b));
		System.out.println("Le résultat de " +a+ "-" +b+ " est " + (a-b));
		System.out.println("Le résultat de " +a+ "/" +b+ " est " + (a/b));
		System.out.println("Le résultat de " +a+ "%" +b+ " est " + (a%b));
	}

}
