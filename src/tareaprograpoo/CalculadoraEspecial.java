package tareaprograpoo;

import java.util.Random;

public class CalculadoraEspecial {
    public int sumatoriaDeNumerosAleatorios() {
        int resultado = 0;
        // Realiza la suma de dos números generados aleatoriamente
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        resultado = num1 + num2;
        return resultado;
    }
    
    public double SenoDeAngulos() {

        double resultado = 0.0;
        // Calcula el seno de un ángulo aleatorio en radianes
        Random random = new Random();
        double angulo = Math.toRadians(random.nextDouble() * 360);
        resultado = Math.sin(angulo);
        return resultado;
    }
    
    public String CadenaInvertida() {
        
        String resultado = "";
        // Genera una cadena de texto aleatoria
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        resultado = sb.toString();
        return resultado;
    }
    
    public boolean VerificarNumeroPar() {
        
        boolean resultado = false;
        // Verifica si un número aleatorio es par
        Random random = new Random();
        int numero = random.nextInt(100);
        resultado = numero % 2 == 0;
        return resultado;
    }
    
    public void MensajeEspecialCalculadora() {
        
        System.out.println("Este es el Método 5 de Calculadora Especial");
        // Imprime un mensaje adicional
        System.out.println("¡Hola desde el Método 5!");
    }
    
    public int Factorialdeunnumero() {
      
        int resultado = 0;
        // Calcula el factorial de un número
        Random random = new Random();
        int numero = random.nextInt(10) + 1;
        resultado = factorial(numero);
        return resultado;
    }
    
    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}