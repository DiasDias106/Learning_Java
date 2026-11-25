public class Main {

	public static void main(String[] args) {
		Pizza p = new Pizza("crocante",20,"tomate","mozarella","peperoni");
		System.out.println(p.pao);
		System.out.println(p.temp);
		System.out.println(p.molho);
		System.out.println(p.queijo);
		System.out.println(p.acompanhamentos);
		
		Pizza s = new Pizza("crocante","tomate","mozarella","peperoni");
		System.out.println(s.pao);
		System.out.println(s.molho);
		System.out.println(s.queijo);
		System.out.println(s.acompanhamentos);
			
			

	}

}
