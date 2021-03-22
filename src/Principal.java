import java.io.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        
    Scanner teclado = new Scanner(System.in);

System.out.println("Bienvenidos al botín de ElenDer Dragon's");
System.out.println("Su botín es el siguiente");

//pedimos el nombre del jugador
System.out.println("Cómo te llamas aventurero ?");
String nombre = teclado.nextLine();

System.out.println("Bienvenido aventrurero " + nombre + " !");


teclado.close();
    }
}
