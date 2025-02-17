import java.util.Scanner;

public class ExcepcionNumeroImpar {
    
    // Método que lanza una excepción si el número es impar
    public static void verificarNumeroPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número " + numero + " es impar.");
        }
        System.out.println("El número " + numero + " es par.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        try {
            verificarNumeroPar(numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        
        scanner.close();
    }
}
