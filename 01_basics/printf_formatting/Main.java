public class Main {

	public static void main(String[] args) {
		System.out.printf("%d formatar em string ",123);
		boolean mybool = true;
		char mychar = '@';
		String mystring = "nome";
		int myInt = 34;
		double myDouble = 1000;
		
		System.out.printf("%b",mybool);
		System.out.printf("%c",mychar);
		System.out.printf("%s",mystring);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble); //conveteer caracteres ou usado para escrever certo valor(igual a linguagem c
		
		System.out.printf("ola %10s",mystring); // defenir um tamanha;
		
		System.out.printf("temns muito dinheiro %.1f",myDouble); // defenir a precição dos numeros com virgula flutuante
        
		System.out.printf("tu tens este dinheiro %+f",myDouble); //usar operdaores junto com os numeros escritos
		System.out.printf("tu tens este dinheiro %,f",myDouble); //usar operdaores junto com os numeros escritos
		
	}

}
