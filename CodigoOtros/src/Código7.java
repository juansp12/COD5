import java.util.HashMap;//se importi el paquete de HashMap
import java.util.Scanner;//se importo este paquete para Scanner

public class Código7 {

	public static void main(String[] args) {// se agrego el Main para que pudira correr aqui el codigo
		Scanner s = new Scanner(System.in);//se agrego el System.in 

	    HashMap<String, String> ca = new HashMap<>();//se cambio a String String 
	    //Se cambio la variable capitales a ca porque es lo que viene en el HashMap
	    ca.put("Canadá", "Otawwa");
	    ca.put("Estados Unidos", "Washington DC");
	    ca.put("México", "México DF");
	    ca.put("Belice", "Belmopán");
	    ca.put("Costa rica", "San José");
	    ca.put("El Salvador", "San Salvador");//Añadi la capital del El Salvador que faltabaM 
	    ca.put("Guatemala", "Ciudad de Guatemala");
	    ca.put("Honduras", "Tegucigalpa");
	    ca.put("Nicaragua", "Managua");
	    ca.put("Panamá", "Panamá");
	   
	    String c = "";// se corrigio String
	    do {
	      System.out.println("Escribe el nombre de un país y te diré su capital: ");// se corrigio el System.out.println
	      c = s.nextLine();// se cambio a nextLine para leer el String
	      
	      if (!c.equals("salir")) {//se corrigio equals
	        if (ca.containsKey(c)) {//se cambio de Value a Key
	          System.out.println("La capital de " + c);// se corrigio el System.out.println
	          System.out.println(" es " + ca.get(c));//cambiamos de .put a .get 
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String capital = s.nextLine();// cambiamos esta variable de ca a capital 
	          ca.put(c, capital);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));//se corrigio el while y se agrego un ) mas
	    s.close();//se cerro el Scanner
	}//main
}//class Código7

