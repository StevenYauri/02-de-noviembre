import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número N: ");
        int n = teclado.nextInt();
        
        int cantidad = 0;
        int suma = 0;
        
        System.out.println("\n--- Secuencia ---");
        // Ciclo for para generar la secuencia desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); // Imprime en la misma línea separado por un espacio
            
            cantidad++;       // Cuenta cada número mostrado
            suma += i;        // Acumula el valor en la suma total
        }
        
        // Mostrar los resultados finales
        System.out.println("\n\n--- Resultados ---");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);
        
        teclado.close();
    }
}
