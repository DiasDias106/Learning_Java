public class Main {

	public static void main(String[] args) {
		String nome = "Francisco";
		boolean resultado = nome.equals("francisco"); // compara 2 strings
		boolean resultado1 = nome.equalsIgnoreCase("francisco"); // compara 2 strings mas ignora maiusculas
		char resultado2 = nome.charAt(2);  //escreve a letra que esta numa certa posição
		int resultado3 = nome.indexOf("a");  //verifica a posiçao de letra
		boolean resultado4 = nome.isEmpty(); // verifica se esta vazio e retorna verdadeiro ou falso
		String Resultado = nome.toLowerCase(); // muda a string para minusculas
		String resultado6 = nome.trim(); // ignora os espaços numa string
		String resultado7 = nome.replace('o', 'a'); //sustitui na string

	}

}
