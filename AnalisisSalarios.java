import java.util.Scanner;

public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double planillaTotal = 0;
        double sueldoMayor = Double.MIN_VALUE; // Inicializa con el valor más bajo
        double sueldoMenor = Double.MAX_VALUE; // Inicializa con el valor más alto
        int trabajadoresMasDe2500 = 0;
        
        System.out.println("Ingrese el sueldo de los 25 trabajadores:");
        
        // Ciclo for para registrar exactamente 25 empleados
        for (int i = 1; i <= 25; i++) {
            System.out.print("Sueldo del trabajador " + i + ": S/ ");
            double sueldo = teclado.nextDouble();
            
            // Acumular para el monto total de la planilla
            planillaTotal += sueldo;
            
            // Determinar si es el sueldo mayor
            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
            }
            
            // Determinar si es el sueldo menor
            if (sueldo < sueldoMenor) {
                sueldoMenor = sueldo;
            }
            
            // Contar cuántos ganan más de S/ 2500
            if (sueldo > 2500) {
                trabajadoresMasDe2500++;
            }
        }
        
        // Calcular el sueldo promedio
        double promedio = planillaTotal / 25;
        
        // Mostrar los resultados en el formato solicitado
        System.out.println("\n--- Reporte de Planilla ---");
        System.out.printf("Planilla total: S/ %,.0f\n", planillaTotal);
        System.out.printf("Promedio: S/ %,.0f\n", promedio);
        System.out.printf("Mayor sueldo: S/ %,.0f\n", sueldoMayor);
        System.out.printf("Menor sueldo: S/ %,.0f\n", sueldoMenor);
        System.out.println("Trabajadores con sueldo > S/2500: " + trabajadoresMasDe2500);
        
        teclado.close();
    }
}
