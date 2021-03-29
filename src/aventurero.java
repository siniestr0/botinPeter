public class aventurero {

private String nombre;
int calidad =0;
int item = 0;

public aventurero(String nombre) {
    this.nombre = nombre;
}

public void jugador (String nombre){
this.nombre = nombre;
}

public void jugador (){
this.nombre = ("");

}
public String getJugador() {
    return nombre;

}

public void setJugador(String nombre) {
    this.nombre = nombre;

}
//locura letras y numeros

/*
vamos a crear un metodo juntando los dos metodos de calidad y objeto
*/

public void botin(){

System.out.println (calidad = (int)(Math.random()*5+1));
System.out.println (item = (int)(Math.random()*8+1));

    if(calidad == 1 && item == 1){
        System.out.println("El cofre es común y has conseguido un arma");

    }else if(calidad == 2 && item == 1){
    System.out.println("El cofre es raro y has conseguido un arma");

    }else if(calidad == 3 && item == 1){
    System.out.println("El cofre es magico y has conseguido un arma");

    }else if (calidad == 4 && item == 1){
        System.out.println("El cofre es epico y has conseguido un arma !!");

    }else if(calidad == 5 && item == 1 ) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido un arma !!!!");

    }

    if(calidad == 1 && item == 2){
        System.out.println("El cofre es común y has conseguido un escudo");

    }else if(calidad == 2 && item == 2){
    System.out.println("El cofre es raro y has conseguido un escudo");

    }else if(calidad == 3 && item == 2){
    System.out.println("El cofre es magico y has conseguido un escudo");

    }else if (calidad == 4 && item == 2){
        System.out.println("El cofre es epico y has conseguido un escudo !!");

    }else if(calidad == 5 && item == 2) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido un escudo !!!!");

    }

    if(calidad == 1 && item == 3){
        System.out.println("El cofre es común y has conseguido unos guantes");

    }else if(calidad == 2 && item == 3){
    System.out.println("El cofre es raro y has conseguido unos guantes");

    }else if(calidad == 3 && item == 3){
    System.out.println("El cofre es magico y has conseguido unos guantes");

    }else if (calidad == 4 && item == 3){
        System.out.println("El cofre es epico y has conseguido unos guantes !!");

    }else if(calidad == 5 && item == 3) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido unos guantes !!!!");

    }


    if(calidad == 1 && item == 4){
        System.out.println("El cofre es común y has conseguido un cinturon");

    }else if(calidad == 2 && item == 4){
    System.out.println("El cofre es raro y has conseguido un cinturon");

    }else if(calidad == 3 && item == 4){
    System.out.println("El cofre es magico y has conseguido un cinturon");

    }else if (calidad == 4 && item == 4){
        System.out.println("El cofre es epico y has conseguido un cinturon !!");

    }else if(calidad == 5 && item == 4) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido un cinturon !!!!");

    }


    if(calidad == 1 && item == 5){
        System.out.println("El cofre es común y has conseguido unos pantalones");

    }else if(calidad == 2 && item == 5){
    System.out.println("El cofre es raro y has conseguido unos pantalones");

    }else if(calidad == 3 && item == 5){
    System.out.println("El cofre es magico y has conseguido unos pantalones");

    }else if (calidad == 4 && item == 5){
        System.out.println("El cofre es epico y has conseguido unos pantalones !!");

    }else if(calidad == 5 && item == 5) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido unos pantalones !!!!");

    }


    if(calidad == 1 && item == 6){
        System.out.println("El cofre es común y has conseguido un casco");

    }else if(calidad == 2 && item == 6){
    System.out.println("El cofre es raro y has conseguido un casco");

    }else if(calidad == 3 && item == 6){
    System.out.println("El cofre es magico y has conseguido un casco");

    }else if (calidad == 4 && item == 6){
        System.out.println("El cofre es epico y has conseguido un casco !!");

    }else if(calidad == 5 && item == 6) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido un casco !!!!");

    }


    if(calidad == 1 && item == 7){
        System.out.println("El cofre es común y has conseguido una armadura");

    }else if(calidad == 2 && item == 7){
    System.out.println("El cofre es raro y has conseguido una armadura");

    }else if(calidad == 3 && item == 7){
    System.out.println("El cofre es magico y has conseguido una armadura");

    }else if (calidad == 4 && item == 7){
        System.out.println("El cofre es epico y has conseguido una armadura !!");

    }else if(calidad == 5 && item == 7) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido una armadura !!!!");

    }


    if(calidad == 1 && item == 8){
        System.out.println("El cofre es común y has conseguido unas botas");

    }else if(calidad == 2 && item == 8){
    System.out.println("El cofre es raro y has conseguido unas botas");

    }else if(calidad == 3 && item == 8){
    System.out.println("El cofre es magico y has conseguido unas botas");

    }else if (calidad == 4 && item == 8){
        System.out.println("El cofre es epico y has conseguido unas botas !!");

    }else if(calidad == 5 && item == 8) {
    System.out.println("Increíble !!! Has conseguido un cofre LEGEN .... wait for it ....  DARY y has conseguido unas botas !!!!");

    }
}

}

/*
Lo que ahora ya no se ( que igual si con array ) sería si el cofre es blanco y saca unas botas que ponga que botas ha sacado
si el cofre que ha sacado es naranja que ponga que item ha sacado, como en cada cofre el objeto se llama distinto.
Si eso lo consigues, te lo ganas del todo
*/

