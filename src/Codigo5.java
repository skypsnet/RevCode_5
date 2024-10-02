import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int ni = s.nextInt();
	    int c = ni;
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 1) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	      }
	    }
	    
	    
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  
	    s.close();

	}

}
