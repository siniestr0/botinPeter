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
1: blanco / comun
2: verde / raro
3: azul / magico
4: morado / epico
5: naranja / legendario
*/
   System.out.println(int numero = (int)(Math.random()*5+1);
   if(numero == 1){
   System.out.println("El cofre es común");

   }else if(numero == 2){
       System.out.println("El cofre es raro");

   }else if(numero == 3){
       System.out.println("El cofre es magico");

   }else if (numero == 4){
        System.out.println("El cofre es epico !!");

   }else if(numero == 5){
       System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY !!!!");

    }
   }
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
       System.out.println(int numero = (int)(Math.random()*8+1); 

       if(numero == 1){
        System.out.println("");
     
        }else if(numero == 2){
            System.out.println("");
     
        }else if(numero == 3){
            System.out.println("");
     
        }else if (numero == 4){
             System.out.println("");
     
        }else if(numero == 5){
            System.out.println("");

        }else if(numero == 6){
            System.out.println("");

        }else if(numero == 7){
            System.out.println("");

        }else if(numero == 8){
            System.out.println("");

        }
    }
}

}