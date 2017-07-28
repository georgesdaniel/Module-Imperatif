
public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println("Les éléments du tableau sont : ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Les éléments inverses du tableau sont : ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Affichage des entiers supérieurs à 3 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Affichage des entiers paires : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 & array[i] != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Affichage du plus grand élément du Tableau : ");
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];

			}
		}
		System.out.println(max);
		
		System.out.println("\n");
		System.out.println("Affichage du plus petit élément du Tableau : ");
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}
		}
		System.out.println(min);
	}
}
