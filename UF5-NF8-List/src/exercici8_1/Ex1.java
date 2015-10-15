package exercici8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		// Declaracion de la lista
		List<Integer> listNumber = new ArrayList<Integer>();

		// Le damos los dos valores iniciales
		listNumber.add(0);
		listNumber.add(1);

		// Creamos la lista
		for (int i = 2; i < 25; i++) {
			listNumber.add(listNumber.get(i - 2) + listNumber.get(i - 1));
		}
		listNumber.removeAll(Collections.singleton(13));
		// Imprimos la lista
		for (int i = 0; i < listNumber.size(); i++) {
			System.out.println("For: " + listNumber.get(i));
		}

		System.out.println("========================");
		for (Integer elemento : listNumber) {
			System.out.println("Foreach: " + elemento);
		}

		System.out.println("========================");
		Iterator<Integer> it = listNumber.iterator();
		while (it.hasNext()) {
			Integer elemento = it.next();
			System.out.print("Iterator: " + elemento);
			System.out.println(" ");
		}
		// Buscando el elemento
		System.out.println("La posición del valor 2584 es: " + listNumber.indexOf(2584));
		System.out.println("La posición del valor 4311 es: " + listNumber.indexOf(4311));

	}

}
