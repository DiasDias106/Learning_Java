import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("ice_cream");
        food.add("spaguetti");
        
        food.remove(2);
        food.set(0,"sushi");
        //food.clear();
        
        for(int i=0; i<food.size(); i++){
        	System.out.println(food.get(i));
        }
	}

}
