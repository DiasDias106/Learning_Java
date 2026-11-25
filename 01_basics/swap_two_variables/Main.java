public class Main {

	public static void main(String[] args) {
		String nome = "tua prima";
		String nome1 = "teu primo";
		String temp;
		
		temp = nome;
		nome = nome1;
		nome1 = temp;
		
		System.out.println(nome);
		System.out.println(nome1);

	}

}
