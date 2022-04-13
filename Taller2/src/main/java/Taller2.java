public class Taller2 {
    public static void main(String[] args) {
        int a = 13;
        double[][]sensor=new double[24][];
        rellenarMatriz(sensor);

    }
    public static void rellenarMatriz(double[][]sensor){
        int hora = 0;
        for (int i = 0; i < sensor.length; i++) {
            hora++;
            sensor[i][0]= hora;
            sensor[i][1]=((Math.random()*9.5)+1);

        }
        for (int i = 0; i < sensor.length; i++) {
                System.out.print(sensor[i][0]);

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
