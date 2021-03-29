import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        
    Scanner teclado = new Scanner(System.in);

    //creamos el objeto jugador

    aventurero j1 = new aventurero ("Elena");

System.out.println("Bienvenidos al botín de ElenDer Dragon's");

System.out.println("Bienvenido aventrurero " + j1.getJugador() + " !");
System.out.println("Este es el botin que has sacado");
j1.botin();

teclado.close();
    }
}
