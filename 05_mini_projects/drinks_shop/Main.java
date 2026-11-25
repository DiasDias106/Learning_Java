import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String[] bebidas=  {"sumo_de_laranja","sumo_de_maça","coca_cola","fanta","guarana","cafe"};
		double[] preco = {1.50,1.50,2,2,2.50,0.70};
		boolean op1 = true;
		//Exercicio de criação de um negocio de bebidas
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja bem vindo a nossa loja o que vai desejar"); 
		String op = scan.nextLine();
		System.out.println("introduza o pagamento:");
		double dinheiro = scan.nextDouble();
		if(dinheiro != 0) {
			System.out.println("possui dinheiro");
		}
		while(op1==true) {
		if(op == bebidas[0] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[0];
			System.out.println("obrigado pela sua compra");
		}
		if(op == bebidas[1] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[1];
			System.out.println("obrigado pela sua compra");
		}
		if(op == bebidas[2] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[2];
			System.out.println("obrigado pela sua compra");
		}
		if(op == bebidas[3] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[3];
			System.out.println("obrigado pela sua compra");
		}
		if(op == bebidas[4] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[4];
			System.out.println("obrigado pela sua compra");
		}
		if(op == bebidas[5] && dinheiro!=0 && dinheiro>0) {
			dinheiro = dinheiro - preco[5];
			System.out.println("obrigado pela sua compra");
		}
		System.out.println("Deseja continuar? se sim escreva true se nao escreva false");
		boolean op2 = scan.nextBoolean();
		op1 = op2;
		}
	
		
		
		
		
		
		

	}

}
