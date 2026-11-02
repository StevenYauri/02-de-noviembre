import java.util.Scanner; // 1. FALTA ESTA IMPORTACIÓN ARRIBA DEL TODO

public class SumaConsecutivos {
    public static void main(String[] args) {
        // 2. Deja únicamente esta línea para el Scanner:
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo N: ");
        int n = teclado.nextInt();
        
        int suma = 0; // Variable acumuladora
        
        // Ciclo for para sumar desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            suma = suma + i; 
        }
        
        // Mostrar el resultado en el formato solicitado
        System.out.println("La suma de los números es: " + suma);
        
        teclado.close();
    }
}
