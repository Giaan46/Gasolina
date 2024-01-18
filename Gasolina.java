package sentencias;

import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de litros de gasolina que hay en el tanque ");
        int gasolina = sc.nextInt();

        if (gasolina == 70) {
            //Si la capacidad actual es 70 litros: imprimir Estanque lleno
            System.out.println("el estanque esta lleno ");
        } else if (gasolina >= 60 && gasolina <= 69) {
            //Si está entre 60 y menor a 70: imprimir Estanque casi lleno
            System.out.println("el estanque esta casi lleno ");
        } else if (gasolina >= 40 && gasolina <= 59) {
            //Si está entre 40 y menor a 60: imprimir Estanque  3/4
            System.out.println("el estanque esta a 3/4");
        } else if (gasolina >= 35 && gasolina <= 39) {
        //Si está entre 35 y menor a 40: imprimir Medio Estanque
        System.out.println("el estanque esta por la mitad ");
        }else if (gasolina >= 20 && gasolina <= 34 ){
            //Si está entre 20 y menor a 35: imprimir Suficiente
            System.out.println("estanque suficiente ");
        }else if(gasolina >= 1 && gasolina <= 19){
            //Si está entre 1 y menor a 20: imprimir Insuficiente
            System.out.println("estanque insuficiente ");
        }


    }
}
