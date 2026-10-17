import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pacinetes_ciclo = true;
        final double DESCUENTO = 0.15;
        int pacinetes_ninos = 0;
        int pacinetes_menores = 0;
        int pacinetes_adultos = 0;
        int pacinetes_mayores = 0;
        double descunetos_aplicados = 0;
        double dinero = 0;

        while (pacinetes_ciclo == true) {
            System.out.println("Ingresa su edad:");
            int edad = sc.nextInt();
            System.out.println("Costo de la consulta:");
            double consulta = sc.nextDouble();

            if (edad < 12) {
                pacinetes_ninos += 1;
            }
            if (edad >= 12 && edad < 18) {
                pacinetes_menores += 1;
            }
            if (edad >= 18 && edad <= 59) {
                pacinetes_adultos += 1;
            }
            if (edad >= 60) {
                pacinetes_mayores += 1;
                double cant_des = consulta * DESCUENTO;
                descunetos_aplicados += cant_des;
                consulta -= cant_des;
            }
            dinero += consulta;

            System.out.println("Finalizar registro?: y/n");
            String finalizar = sc.next();
            if (finalizar.equalsIgnoreCase("y")) {
                pacinetes_ciclo = false;
            }
        }

        int total_personas = pacinetes_ninos + pacinetes_adultos + pacinetes_mayores + pacinetes_menores;
        double promedio_dinero = 0;
        if (total_personas > 0) {
            promedio_dinero = dinero / total_personas;
        }

        System.out.println("Niños: " + pacinetes_ninos);
        System.out.println("Adolescentes: " + pacinetes_menores);
        System.out.println("Adultos: " + pacinetes_adultos);
        System.out.println("Adultos mayores: " + pacinetes_mayores);
        System.out.println("Total de descuentos: " + pacinetes_mayores + " descuentos aplicados: " + descunetos_aplicados);
        System.out.println("Promedio por paciente: " + promedio_dinero);
        System.out.println("Dinero recaudado: " + dinero);
    }
}