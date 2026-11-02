import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número N: ");
        int n = teclado.nextInt();
        
        System.out.println("\n--- Patrón Generado ---");
        
        // Ciclo externo: controla cuántas filas (líneas) se van a dibujar
        for (int fila = 1; fila <= n; fila++) {
            
            // Ciclo interno: controla qué números se imprimen en la fila actual
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna); // Imprime los números juntos en la misma línea
            }
            
            System.out.println(); // Da un salto de línea al terminar cada fila
        }
        
        teclado.close();
    }
}
