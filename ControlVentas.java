import java.util.Scanner;

public class ControlVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double ventaTotal = 0;
        double mayorVenta = Double.MIN_VALUE; // Para rastrear el monto más alto
        int diaMayorVenta = 0;               // Para rastrear qué día fue (1 al 7)
        
        System.out.println("Ingrese las ventas de los 7 días:");
        
        // Ciclo for para recorrer los 7 días de la semana
        for (int i = 1; i <= 7; i++) {
            System.out.print("Venta del Día " + i + ": S/ ");
            double ventaDia = teclado.nextDouble();
            
            // Acumular el dinero para el total semanal
            ventaTotal += ventaDia;
            
            // Si la venta actual supera a la mayor registrada, actualizamos monto y día
            if (ventaDia > mayorVenta) {
                mayorVenta = ventaDia;
                diaMayorVenta = i; // Guardamos el número de día actual (i)
            }
        }
        
        // Calcular el promedio de ventas diarias
        double promedio = ventaTotal / 7;
        
        // Mostrar los resultados en el formato solicitado
        System.out.println("\n--- Reporte Semanal ---");
        System.out.printf("Venta total: S/ %.2f\n", ventaTotal);
        System.out.printf("Promedio: S/ %.2f\n", promedio);
        System.out.println("Mayor venta: Día " + diaMayorVenta);
        
        teclado.close();
    }
}
