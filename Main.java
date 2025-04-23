import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





    
public class Main{
    public static void main(String[] args) {
        
        List<Double> resultados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        try {
            do {

                System.out.println("\nn--MENU--");
                System.out.println("1. Cuadrado");
                System.out.println("2. Rectangulo");
                System.out.println("3. Triangulo");
                System.out.println("4. Circulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Potencia");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
    
                switch (opcion) {
                    case 1:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion2 = scanner.nextInt();
                        if (opcion2 == 1) {
                            System.out.print("Ingrese el lado del cuadrado: ");
                            float lado = scanner.nextFloat();
                            System.out.println("El perimetro del cuadrado es: " + perimetro.Cuadrado(lado));
                            resultados.add(perimetro.Cuadrado(lado));

                        } else if (opcion2 == 2) {
                            System.out.print("Ingrese el lado del cuadrado: ");
                            float lado = scanner.nextFloat();
 
                            System.out.println("El area del cuadrado es: " + area.Cuadrado(lado));
                            resultados.add(area.Cuadrado(lado));
                        } else {
                            System.out.println("Opcion invalida");
                        }
                        
            
                        break;
                    case 2:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion3 = scanner.nextInt();
                        if (opcion3 == 1) {
                            System.out.print("Ingrese la base del rectangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del rectangulo: ");
                            float altura = scanner.nextFloat();
                            System.out.println("El perimetro del rectangulo es: " + perimetro.Rectangulo(base, altura));
                            resultados.add(perimetro.Rectangulo(base, altura));
                        } else if (opcion3 == 2) {
                            System.out.print("Ingrese la base del rectangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del rectangulo: ");
                            float altura = scanner.nextFloat();
                            System.out.println("El area del rectangulo es: " + area.Rectangulo(base, altura));
                            resultados.add(area.Rectangulo(base, altura));
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 3:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion4 = scanner.nextInt();
                        if (opcion4 == 1) {
                            System.out.print("Ingrese el lado 1 del triangulo: ");
                            float lado1 = scanner.nextFloat();
                            System.out.print("Ingrese el lado 2 del triangulo: ");
                            float lado2 = scanner.nextFloat();
                            System.out.print("Ingrese el lado 3 del triangulo: ");
                            float lado3 = scanner.nextFloat();
                            System.out.println("El perimetro del triangulo es: " + perimetro.Triangulo(lado1, lado2, lado3));
                            resultados.add(perimetro.Triangulo(lado1, lado2, lado3));

                        } else if (opcion4 == 2) {
                            System.out.print("Ingrese la base del triangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del triangulo: ");
                            float altura = scanner.nextFloat();
                            System.out.println("El area del triangulo es: " + area.Triangulo(base, altura));
                            resultados.add(area.Triangulo(base, altura));
                            
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 4:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion5 = scanner.nextInt();
                        if (opcion5 == 1) {
                            System.out.print("Ingrese el radio del circulo: ");
                            float radio = scanner.nextFloat();
                            System.out.println("El perimetro del circulo es: " + perimetro.Circulo(radio));
                            resultados.add(perimetro.Circulo(radio));

                        } else if (opcion5 == 2) {
                            System.out.print("Ingrese el radio del circulo: ");
                            float radio = scanner.nextFloat();
                            System.out.println("El area del circulo es: " + area.Circulo(radio));
                            resultados.add(area.Circulo(radio));
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 5 :
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion6 = scanner.nextInt();
                        if (opcion6 == 1) {
                            System.out.print("Ingrese el lado del pentágono: ");
                            float lado = scanner.nextFloat();
                            System.out.println("El perimetro del pentágono es: " + perimetro.Pentagono(lado));
                            resultados.add(perimetro.Pentagono(lado));

                        } else if (opcion6 == 2) {
                            System.out.print("Ingrese el lado del pentágono: ");
                            float lado = scanner.nextFloat();
                            System.out.print("Ingrese el apotema del pentágono: ");
                            float apotema = scanner.nextFloat();
                            System.out.println("El area del pentágono es: " + area.Pentagono(lado, apotema));
                            resultados.add(area.Pentagono(lado, apotema));
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;

                    case 6:
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        double exponente = scanner.nextDouble();
                        System.out.println("La potencia es: " + potencia.potencia1(base, exponente));
                        resultados.add(potencia.potencia1(base, exponente));
                        break;
    
                    case 0:
                        System.out.println("Hasta luego!");
                        for (int i = 0; i < resultados.size(); i++) {
                            System.out.println("Resultado " + (i + 1) + ": " + resultados.get(i));
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } while (opcion != 0);
            scanner.close();  
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
        }     
    }
            
}