import java.util.Scanner;//se importo el java.util.Scanner

public class Codigo5 {
	public static void main(String[] args) {// se agrego el main para que corra el codigo
	 Scanner s = new Scanner(System.in);//Se agrego un argumento
	    System.out.println("Introduzca un número: ");
	    int ni = s.nextInt();//se cambio a nextInt ya que iba a ser un numero
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
	    	 int digito = ni % 10; //quitamos el int
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		 
	    }
	      ni /= 10;{// Se cambio la posicion de ni /=10 ya que lanzaba un mensaje infinito en la consola
	    	  
	      }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//se corrigio el prinln
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    s.close();
	  }
}//se agrego otra llave
}//class Codigo5
