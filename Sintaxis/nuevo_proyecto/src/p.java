public class p {
    // Método que suma dos números y devuelve el resultado
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        p calc = new p(); // Crear objeto
        int resultado = calc.sumar(5, 3); // Llamar al método
        System.out.println("La suma es: " + resultado);
    }
}