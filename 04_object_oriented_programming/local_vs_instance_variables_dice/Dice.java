import java.util.Random;
public class Dice {
	Random r ;
    int num=0;
	Dice(){
	r = new Random();
	    roll();
	}
	
	void roll() {
		num = r.nextInt(6)+1;
		System.out.println(num);
	}
}
