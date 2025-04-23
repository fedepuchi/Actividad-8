public class area {

    public static double Cuadrado(double lado) {
        return lado * lado;
    }
    
    public static double Rectangulo(double base, double altura) {
        return base * altura;
    }
    
    public static double Triangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public static double Circulo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public static double Pentagono(double lado, double apotema) {
        return (5 * lado * apotema) / 2.0;
    }
}
