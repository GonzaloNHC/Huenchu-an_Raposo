import java.util.Random;
import java.util.Scanner;

public class Taller02 {

    static String[] Opcion = {"[1] Mostrar sismo más intenso", "[2] Mostrar sismo mayor a 4.0", "[3] Reiniciar Arreglo","[4] Salir"};

    public static void main(String [] args){
        inicializar();
    }

    public static void inicializar(){
        int opcion = -1;
        System.out.println("ingrese cantidad de dias");
        int Dias = ingresar();
        Double Sensor[][]= new Double[Dias][2];
        menu();
        opcion = ingresar();
        ejecutar(opcion);
    }

    public static void menu(){
        System.out.println("Bienvenidos al sistema de sismologia");
        System.out.println("");
        System.out.println("Seleccione la opcion correspondiente");
        System.out.println(Opcion[0]);
        System.out.println(Opcion[0]);
        System.out.println(Opcion[0]);
        System.out.println(Opcion[0]);
    }



    public static void ejecutar(int opcion){
        switch (opcion){
            case 1 -> MostrarSismo();
            case 2 -> MostrarMayor40();
            case 3 -> Reiniciar();
            case 4 -> Salir();
        }
    }

    public static void MostrarSismo(){
        System.out.println("hola");
    }

    public static void MostrarMayor40(){
        System.out.println("hola");
    }

    public static void Reiniciar(){
        System.out.println("hola");
    }

    public static void Salir(){
        System.out.println("hola");
    }





    public static int ingresar() {
        return new Scanner(System.in).nextInt();
    }

}
