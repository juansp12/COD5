import java.util.Scanner;// se agrego un escaner para la opcion de que numeros resaltar

public class codigo6 {
	public static void main(String[] args) {// se agrgeo el main para que pudiera correr la clase
	int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {//se agrego un + al contador i+
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");//Se corrigio el sysout que estaba mal escrito
	    }
	    Scanner sc = new Scanner(System.in);
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = sc.nextInt();//se cambio a Scanner para leer las opciones

	    int multiplo = (opcion == 1) ? 5 : 7;

	    for (int e : n) {// se arreglo el foreach
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }  else {// se agrego una } antes del else que no estaba
	        System.out.println(e + " "); //se arreglo el system.out que estaba mal escrito
	      }
	    } 
	    sc.close();// se cierra el Scanner
	}
}