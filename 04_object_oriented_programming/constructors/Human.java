public class Human {
	String nome;
	int idade;
	double peso;
       Human(String nome, int idade , double peso){
    	   System.out.println("bem vindo" + nome);
    	   this.nome = nome;
    	   this.idade = idade;
    	   this.peso = peso;
       }
     void comer() {
    	 System.out.println(this.nome + "esta a comer");
     }
}
