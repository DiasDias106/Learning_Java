public class Car {
   String cor ="azul";
   String modelo = "ford";
   int ano = 2021;
   
   
   public String toString() { //override de um metodo to string 
	   String myString = cor +"\n" + modelo + "\n" + ano;
	   return myString;
   }
   
}
