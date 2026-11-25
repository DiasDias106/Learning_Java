import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<String> paderialista = new ArrayList();
		paderialista.add("pao");
		paderialista.add("massa");
		paderialista.add("donuts");
		
		ArrayList<String> frutaria = new ArrayList();
		frutaria.add("pepino");
	    frutaria.add("tomate");
		frutaria.add("cebola");
		
		ArrayList<String> Bebidas = new ArrayList();
		Bebidas.add("cola");
		Bebidas.add("sprite");
		Bebidas.add("fanta");
		
		ArrayList<ArrayList<String>> merciaria = new ArrayList();
		merciaria.add(paderialista);
		merciaria.add(Bebidas);
		merciaria.add(frutaria);
		
		System.out.println(merciaria.get(0).get(0));//primeiro elemento da primeira lista

	}

}
