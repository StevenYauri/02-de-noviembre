import java.util.Scanner;

public class ConteoParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaPares = 0;
        
        System.out.println("Ingrese 20 números enteros:");
        
        // Ciclo for para solicitar exactamente 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = teclado.nextInt();
            
            // Verificar si el número es par usando el residuo de la división entre 2
            if (numero % 2 == 0) {
                contadorPares++;       // Incrementa el contador de pares
                sumaPares += numero;   // Acumula el valor del número par
            } else {
                contadorImpares++;     // Incrementa el contador de impares
            }
        }
        
        // Mostrar los resultados en el formato solicitado
        System.out.println("\n--- Resultados ---");
        System.out.println("Pares: " + contadorPares);
        System.out.println("Impares: " + contadorImpares);
        System.out.println("Suma de pares: " + sumaPares);
        
        teclado.close();
    }
}
