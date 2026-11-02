import java.util.Scanner;

public class EncuestaEstudantil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Contadores para cada opción de la encuesta
        int excelente = 0;
        int bueno = 0;
        int regular = 0;
        int malo = 0;
        
        System.out.println("--- Menú de Opciones ---");
        System.out.println("1 = Excelente\n2 = Bueno\n3 = Regular\n4 = Malo");
        System.out.println("------------------------\n");
        System.out.println("Ingrese los votos de los 30 estudiantes:");
        
        // Ciclo for para registrar los 30 estudiantes
        for (int i = 1; i <= 30; i++) {
            System.out.print("Voto del estudiante " + i + ": ");
            int voto = teclado.nextInt();
            
            // Evaluar el voto ingresado e incrementar el contador respectivo
            switch (voto) {
                case 1: excelente++; break;
                case 2: bueno++;     break;
                case 3: regular++;   break;
                case 4: malo++;      break;
                default:
                    System.out.println("⚠️ Opción inválida. Este voto no será contado.");
                    i--; // Restamos 1 al ciclo para que repita el turno de este estudiante
                    break;
            }
        }
        
        // Determinar cuál es la opción más votada
        String opcionMasVotada = "Excelente";
        int maxVotos = excelente;
        
        if (bueno > maxVotos) {
            maxVotos = bueno;
            opcionMasVotada = "Bueno";
        }
        if (regular > maxVotos) {
            maxVotos = regular;
            opcionMasVotada = "Regular";
        }
        if (malo > maxVotos) {
            maxVotos = malo;
            opcionMasVotada = "Malo";
        }
        
        // Mostrar los resultados en el formato solicitado
        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);
        System.out.println("Opción más votada: " + opcionMasVotada);
        
        teclado.close();
    }
}
