package Generalite;
import java.util.List;
import java.util.ArrayList;

public class ArrayGeneralite{
	public static void main(String[] args) {
	   System.out.println("Liste de type sting :");
	   System.out.println("----------------------");
	   List<String> listeString = new ArrayList<String>();
	   listeString.add("Mouna");
	   listeString.add("Mostafa");
	   listeString.add("Amjad");
	   listeString.add("Israe");
	   
	   for(String str : listeString) {
		   System.out.println(str);
	   }
	   
	   System.out.println("Liste de type float :");
	   System.out.println("---------------------");
	   List<Float> listFloat = new ArrayList<Float>();
	   listFloat.add(1.16F);
	   listFloat.add(1.26F);
	   listFloat.add(1.36F);
	   listFloat.add(1.46F);
	   
	   for(Float fli : listFloat) {
		   System.out.println(fli);
	   }
	}
}