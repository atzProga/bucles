import java.util.Scanner;

public class gas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DESCUENTO = 0.05;
        double litros_vendidos = 0;
        int descuentos = 0;
        boolean gas = true;
        int cargas_realizadas = 0;
        double importe_sin_descuento = 0;
        double total_cobrado = 0;

        while (gas == true) {
            System.out.println("Litros Cargados:");
            double litros = sc.nextDouble();
            System.out.println("Precio por litro:");
            double precio_litro = sc.nextDouble();

            if (litros <= 0 || precio_litro <= 0) {
                System.out.println("Los litros y el precio deben ser mayores que cero");
                continue;
            }

            litros_vendidos += litros;
            cargas_realizadas += 1;
            double importe = litros * precio_litro;
            importe_sin_descuento += importe;

            if (litros >= 40) {
                double montodes = DESCUENTO * importe;
                importe -= montodes;
                descuentos += 1;
            }
            total_cobrado += importe;

            System.out.println("Importe de la carga: " + importe);
            System.out.println("Finalizar registro?: y/n");
            String finalizar = sc.next();
            if (finalizar.equalsIgnoreCase("y")) {
                gas = false;
            }
        }

        double promedio = total_cobrado / cargas_realizadas;

        System.out.println("Cargas realizadas: " + cargas_realizadas);
        System.out.println("Total de litros vendidos: " + litros_vendidos);
        System.out.println("Importe antes de descuentos: " + importe_sin_descuento);
        System.out.println("Cargas con descuento: " + descuentos);
        System.out.println("Total cobrado: " + total_cobrado);
        System.out.println("Importe promedio por carga: " + promedio);
    }
}