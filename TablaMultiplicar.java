import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número para generar su tabla: ");
        int numero = teclado.nextInt();
        
        int sumaTotal = 0; // Variable para acumular los resultados
        
        System.out.println("\n--- Tabla del " + numero + " ---");
        
        // Ciclo for desde 1 hasta 15
        for (int i = 1; i <= 15; i++) {
            int resultado = numero * i;
            
            // Mostrar la multiplicación actual (Ejemplo: 7 x 1 = 7)
            System.out.println(numero + " x " + i + " = " + resultado);
            
            // Sumar el resultado al acumulador
            sumaTotal += resultado; // Es lo mismo que: sumaTotal = sumaTotal + resultado;
        }
        
        // Mostrar la suma total de los resultados
        System.out.println("\nSuma total = " + sumaTotal);
        
        teclado.close();
    }
}
