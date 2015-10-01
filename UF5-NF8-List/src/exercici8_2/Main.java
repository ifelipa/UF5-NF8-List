package exercici8_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Cotxe> listCars = new ArrayList<Cotxe>();

		listCars.add(new Cotxe("Alfa Romeo", "Giulia", 6, 2900));
		listCars.add(new Cotxe("Dacia", "Sandero", 4, 1200));
		listCars.add(new Cotxe("Ford", "Focus", 4, 2000));
		listCars.add(new Cotxe("Opel", "Insignia", 4, 2200));
		listCars.add(new Cotxe("Seat", "Ibiza", 4, 1600));

		System.out.println("La potencia fiscal es: " + listCars.get(3).potFiscal());

		// Añadiendo dos coches
		listCars.add(new Cotxe("Hyundai", "Atos", 3, 1500));
		listCars.add(new Cotxe("Ford", "Focus", 4, 2000));
		
		System.out.println("=======================");
		System.out.println("Pots afegir-hi duplicats? Si");

		System.out.println("=======================");
		// Reemplanzando la posicion 1
		System.out.println(listCars.get(1).toString());
		listCars.add(1, new Cotxe("Audi", "A8", 8, 4600));
		System.out.println(listCars.get(1).toString());
		System.out.println("=======================");

		System.out.println(listCars.toString());

		// Sustituyendo el Seat Ibiza (primero lo removemos y luegolo añadimos)
		int index = buscarIndex(listCars, "Seat", "Ibiza");
		listCars.remove(index);
		listCars.add(index, new Cotxe("Seat", "Mii", 3, 1000));

		System.out.println(listCars.toString());

		System.out.println("=======================");

		// Posiciones de coches
		posicionesCoche(listCars, "Ford", "Focus");

		// Recorrido del List

		System.out.println("====== Imprimiendo con for ========");

		for (int i = 0; i < listCars.size(); i++) {
			System.out.println(listCars.get(i).toString());
		}
		System.out.println("====== Imprimiendo con foreach ========");

		for (Cotxe cotxe : listCars) {
			System.out.println(cotxe.toString());
		}

		System.out.println("====== Imprimiendo con Iterator ========");

		Iterator<Cotxe> it = listCars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		}

	private static void posicionesCoche(List<Cotxe> listCars, String marca, String modelo) {
		// TODO Auto-generated method stub
		for (Cotxe cotxe : listCars) {
			if (cotxe.getMarca().equals(marca) && cotxe.getModelo().equals(modelo)) {
				System.out.println(marca+" --> " + listCars.indexOf(cotxe));
			}
		}

	}

	private static int buscarIndex(List<Cotxe> listCars, String marca, String modelo) {
		// TODO Auto-generated method stub
		int index = 0;

		for (Cotxe cotxe : listCars) {
			if (cotxe.getMarca().equals(marca) && cotxe.getModelo().equals(modelo)) {
				index = listCars.indexOf(cotxe);
			}
		}
		return index;
	}

}
