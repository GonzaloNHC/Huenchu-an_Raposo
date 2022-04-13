public class Taller2 {
    public static void main(String[] args) {
        int a = 3;
        double[][]sensor=new double[a][3];
        rellenarMatriz(sensor);
        Mostrar(sensor);
        sismoMayor(sensor);

    }
    public static double[][] rellenarMatriz(double[][]sensor){
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < 3; j++) {
                sensor[i][j]= ((Math.random()*8.5)+1);
            }
        }
        return sensor;
    }
    public static void Mostrar(double[][]sensor){
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sensor[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static double sismoMayor(double[][]sensor){
        double aux=0;
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (aux < sensor[i][j]) {
                    aux=sensor[i][j];
                    //System.out.println(aux);
                }
            }
        }
        System.out.println(aux);
        return aux;
    }
}
