public class Taller2 {
    public static void main(String[] args) {
        int a = 3;
        double[][]sensor=new double[a][24];
        rellenarMatriz(sensor);

    }
    public static void rellenarMatriz(double[][]sensor){
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < 24; j++) {
                sensor[i][j]= ((Math.random()*9.5)+1);
            }
        }
        Mostrar(sensor);
    }
    public static void Mostrar(double[][]sensor){
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.print(sensor[i][j]);
            }
            System.out.println();
        }
    }
    /*public static double sismoMayor(double[][]sensor){
        double aux;
        for (int i = 0; i < sensor.length - 1; i++) {
            for (int j = 0; j < sensor.length - i - 1; j++) {
                if (sensor[j + 1] < sensor[j]) {
                    aux = sensor[j + 1];
                    sensor[j + 1] = sensor[j];
                    sensor[j] = aux;
                    return sensor;
                }
            }
        }

        return aux;
    }*/
}
