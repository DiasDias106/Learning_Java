public class Main {

	public static void main(String[] args) {
		String[] carros = {"tesla","chevrolet","BMW","ford"};
		int[] modelo = {1,2,3,4,5};
		String[] c = new String[3];
		
		carros[0] = "farrari";
		System.out.println(carros[3]);
		c[0] = "lanborguini";
		
		for(int i=0;i<4;i++) {
			System.out.println(carros[i]);
			if(i==5) {
				break;
			}
		}
		

	}

}
