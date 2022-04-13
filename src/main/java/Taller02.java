import java.util.Scanner;

public class Taller02 {

    static String[] Opcion = {"[1] Mostrar sismo más intenso", "[2] Mostrar sismo mayor a 4.0", "[3] Reiniciar Arreglo","[4] Salir"};

    public static void main(String [] args){

        Precargardatos();
    }

    public static void Precargardatos(){
        int opcion = -1;
        System.out.println("ingrese cantidad de dias");
        System.out.println("valor debe ser entre 2 y 32");
        int Dias = ingresar();
        if(esValido(Dias)){
            double Sensor[][]= new double[Dias][24];
            rellenarMatriz(Sensor);
            menu();
            opcion = ingresar();
            ejecutar(opcion);
        }

    }

    public static double[][] rellenarMatriz(double[][] Sensor){
        for (int i = 0; i < Sensor.length; i++) {
            for (int j = 0; j < 24; j++) {
                Sensor[i][j]= ((Math.random()*8.5)+1.0);
            }
        }
        return Sensor;
    }


    public static int ingresar() {
        return new Scanner(System.in).nextInt();
    }

    public static void menu(){
        System.out.println("Bienvenidos al sistema de sismologia");
        System.out.println("");
        System.out.println("Seleccione la opcion correspondiente");
        System.out.println(Opcion[0]);
        System.out.println(Opcion[1]);
        System.out.println(Opcion[2]);
        System.out.println(Opcion[3]);
    }


    public static void ejecutar(int opcion){
            switch (opcion) {
                case 1 -> MostrarSismo();
                case 2 -> MostrarMayor4();
                case 3 -> Reiniciar();
                case 4 -> Salir();
                default -> mostrarError();
        }
    }

    public static void MostrarSismo(){
        System.out.println();
    }

    public static void MostrarMayor4(){
        System.out.println("hola");
    }

    public static void Reiniciar(){
        System.out.println("hola");
    }

    public static void Salir(){
        System.out.println("Gracias por usar la aplicacion");
    }

    private static boolean esValido(int dias){
        throw new DiasNoValidoException(dias);
    }

    public static void mostrarError(){
        System.err.println("opcion incorrecta");
        System.err.println("Escoja otra");
    }


}
