
package Logic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner ingresoTeclado = new Scanner(System.in);
        ArrayList<String> Pelis = new ArrayList<String>();
        
        while(true){
            System.out.print("Ingrese una pelicula: ");
            String ingresarPeliculas = ingresoTeclado.next();
            if(!ingresarPeliculas.equals("exit")){
                Pelis.add(ingresarPeliculas);
            }
            else{
                ingresoTeclado.close();
                break;
            }
        }
        
        Random numeroAleatoreo = new Random();
        int numeroPeli = numeroAleatoreo.nextInt(Pelis.size());
        System.out.println("\nY LA PELICULA ELEGIDA ES: \n");
        for(int i = 0; i < 5; i ++){
            System.out.println("----------------------------------------");
            System.out.println("\nCHA CHA CHA CHAAAAAAAAAANNNN\n");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException  e){
            }
        }
        
        System.out.println("La pelicula elegida es: \n");
        System.out.println("----------------------------------------");
        System.out.println(Pelis.get(numeroPeli).toUpperCase());
        System.out.println("----------------------------------------");
        */
        
        dataBase datosCine = new dataBase();
        Cine cineTerro = datosCine.peliculasCine("chucky");
        
        System.out.println(cineTerro);
    }
}
