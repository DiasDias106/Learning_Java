public class Main {

	public static void main(String[] args) {
		Food[] frigorifico = new Food[3];
		
		Food comida1 = new Food("pizza");
		Food comida2 = new Food("Hamburguer");
		Food comida3 = new Food("salsicha");
		
		frigorifico[0] = comida1;
		frigorifico[1] = comida2;
		frigorifico[2] = comida3;
		
		System.out.println(frigorifico[0].nome);
		System.out.println(frigorifico[1].nome);
		System.out.println(frigorifico[2].nome);
		
		
		Food[] frigorifico1 = {comida1,comida2,comida3}; //outra forma de representar
		

	}

}
