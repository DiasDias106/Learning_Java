public class Main {

	public static void main(String[] args) {
		Garage gar = new Garage();
		
		Car carro1 = new Car("BMW");
		Car carro2 = new Car("porshe");
		
		gar.park(carro1);
		gar.park(carro2);

	}

}
