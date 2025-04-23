

public class perimetro {


    
    public static double Cuadrado(double lado) {
        return lado * 4;
    }
    
    public static double Rectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
    
    public static double Triangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
    
    public static double Circulo(double radio) {
        return 2 * Math.PI * radio;
    }
    
    public static double Pentagono(double lado) {
        return 5 * lado;
    }
}
