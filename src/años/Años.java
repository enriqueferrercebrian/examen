/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package años;

import java.util.*;

/**
 *
 * @author Enrique
 */
public class Años {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String añoInicio = "", añoFinal = "";
        boolean correcto = false;
        final int XIX = 1900, XX = 2000, XXI = 2100;
        boolean ordenCorrecto = false;
        List<Integer> años = new ArrayList<>();
        List<Integer> arrayXX = new ArrayList<>();
        int añoFinalInt, añoIniciolInt, i = 0, edad, contadorXX=0;

        while (!ordenCorrecto) {

            System.out.println("Dime año Inicio: ");
            correcto = false;
            while (!correcto) {

                añoInicio = sc.nextLine();

                if (!añoInicio.matches("^[0-9]{4}$")) {
                    System.out.println("porfavor, ponga un año correcto.");
                } else {
                    correcto = true;
                }
            }

            correcto = false;
            System.out.println("Dime año Final: ");

            while (!correcto) {

                añoFinal = sc.nextLine();

                if (!añoFinal.matches("^[0-9]{4}$")) {
                    System.out.println("porfavor, ponga un año correcto.");
                } else {
                    correcto = true;
                }
            }

            if (Integer.parseInt(añoInicio) > Integer.parseInt(añoFinal)) {
                System.out.println("Porfavor, escriba un año final posterios al año de inicio");

            } else if (Integer.parseInt(añoInicio) >= XIX && Integer.parseInt(añoInicio) <= XXI
                    && Integer.parseInt(añoFinal) >= XIX && Integer.parseInt(añoFinal) <= XXI) {

                ordenCorrecto = true;
            } else {
                System.out.println("Años fuera de rangos.");
            }

        }
        añoIniciolInt = Integer.parseInt(añoInicio);
        añoFinalInt = Integer.parseInt(añoFinal);
        edad = añoFinalInt - añoIniciolInt;
        int x = 0;
        for (i = añoIniciolInt; i <= añoFinalInt; i++) {
            int tmpaño = (añoFinalInt - x);
            System.out.println("nacido en " + tmpaño + " Tiene " + (añoFinalInt - tmpaño));
            x++;
            años.add(tmpaño);

        }
        
        
        for ( int y : años){
            
            if (y <= XX && y> XIX ){
                
                
                
                arrayXX.add(y);
                
                    contadorXX++;
                
            }
            
        }
        System.out.println("Estos años pertenecen a XX : (" + contadorXX + ")");
            for ( int z : arrayXX){
                
                System.out.println(z);
                
            }
        
        

    }
}
