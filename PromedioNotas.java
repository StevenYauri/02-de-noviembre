import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double sumaTotal = 0;
        double notaMayor = Double.MIN_VALUE; // Inicializa con el valor más bajo posible
        double notaMenor = Double.MAX_VALUE; // Inicializa con el valor más alto posible
        
        System.out.println("Ingrese las notas de los 10 estudiantes:");
        
        // Ciclo for para registrar exactamente 10 estudiantes
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nota del estudiante " + i + ": ");
            double nota = teclado.nextDouble();
            
            // Acumular para el promedio
            sumaTotal += nota;
            
            // Determinar si es la nota mayor
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            // Determinar si es la nota menor
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        
        // Calcular el promedio general
        double promedio = sumaTotal / 10;
        
        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor nota: " + notaMayor);
        System.out.println("Menor nota: " + notaMenor);
        
        teclado.close();
    }
}
