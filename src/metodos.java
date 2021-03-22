public class metodos {

private String jugador;

public metodos (String jugador);
this.jugador = jugador;

public metodos ();
this.jugador = ("");

public String getJugador() {
    return jugador;

}

public void setJugador(String jugador) {
    this.jugador = jugador;

}

public void calidadCofre() {
/*
numeros aleatorios entre 1 y 5 que corresponden a :
1: blanco
2: verde
3: azul
4: morado
5: naranja
*/
   System.out.println(int numero = (int)(Math.random()*5+1);); 
   
}

public void item() {
    /*
    numeros aleatorios entre 1 y 8 que corresponden a :
    1: Arma
    2: Escudo
    3: Guantes
    4: Cinturon
    5: Pantalones
    6: Casco
    7: Armadura
    8: Botas
    */
       System.out.println(int numero = (int)(Math.random()*8+1);); 
    }

}