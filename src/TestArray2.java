
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int somme = 0;
		float moyenne = 0;
		int index = -1;
		int i;

		System.out.println("Les éléments du tableau sont : ");

		for (i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

			somme = array[i] + somme;
			if (array[i] == 15) {
				index=i;
				

			}
		}
		System.out.println("L'index de l'élément 15 du tableau est: " + index);
		

		moyenne = somme / array.length;
		System.out.println("\n");
		System.out.println("La somme des éléments du tableau est de : " + somme);

		System.out.println("Nombre d'éléments comportés par le tableau : " + array.length);
		System.out.println("La moyenne des éléments du tableau est de : " + moyenne);

	}

}
