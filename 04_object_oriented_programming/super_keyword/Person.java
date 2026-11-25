public class Person {
String nome;
int age;
Person(String nome,int age){
	this.nome = nome;
	this.age = age;
}
public String toString() {
	return this.nome + "\n" + this.age + "\n"; 
}
}
