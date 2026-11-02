import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        
        // Variable para almacenar el resultado (inicia en 1 porque es una multiplicación)
        long factorial = 1; 
        
        // Ciclo for inverso desde el número hasta 1 (o también puede ir de 1 hasta numero)
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        
        // Mostrar el resultado con el formato solicitado (Ejemplo: 5! = 120)
        System.out.println(numero + "! = " + factorial);
        
        teclado.close();
    }
}
