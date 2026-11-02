import java.util.Scanner;

public class RegistroEdades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edadMayor = Integer.MIN_VALUE; // Inicializa con el valor más bajo posible
        int edadMenor = Integer.MAX_VALUE; // Inicializa con el valor más alto posible
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        
        System.out.println("Ingrese las edades de las 15 personas:");
        
        // Ciclo for para registrar exactamente 15 edades
        for (int i = 1; i <= 15; i++) {
            System.out.print("Edad de la persona " + i + ": ");
            int edad = teclado.nextInt();
            
            // Determinar si es la edad mayor
            if (edad > edadMayor) {
                edadMayor = edad;
            }
            
            // Determinar si es la edad menor
            if (edad < edadMenor) {
                edadMenor = edad;
            }
            
            // Clasificar por mayoría de edad (en la mayoría de países es >= 18)
            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }
        
        // Mostrar los resultados en el formato solicitado
        System.out.println("\n--- Resultados ---");
        System.out.println("Edad mayor: " + edadMayor);
        System.out.println("Edad menor: " + edadMenor);
        System.out.println("Mayores de edad: " + mayoresDeEdad);
        System.out.println("Menores de edad: " + menoresDeEdad);
        
        teclado.close();
    }
}
