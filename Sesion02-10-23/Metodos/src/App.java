import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        //sumarNumeros();
        //System.out.println("Ingrese num1: ");
        //double num1 = lector.nextDouble();
        //System.out.println("Ingrese num2: ");
        //double num2 = lector.nextDouble();
        //restarNumeros(num1,num2);
        //double resultado = multiplicarNumeros();
        //System.out.println("El producto es " + resultado);
        int x = (int)Math.round(Math.random() * 100);
        int y = (int)Math.round(Math.random() * 100);
        //String resultado = verificarNumeros(x,y) ? "Verdadero" : "Falso";
        System.out.println("El numero "+ x + " es menor que " + y + "? " + (verificarNumeros(x,y) ? "Verdadero" : "Falso"));
    }
    
    //Declaracion de metodos
    //1- Metodos que no requieren datos de entrada ni devuelven datos de salida
    public static void sumarNumeros(){
        System.out.println("Ingrese a: ");
        double num1 = lector.nextDouble();
        System.out.println("Ingrese b: ");
        double num2 = lector.nextDouble();
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + (num1+num2));
    }
    
    //2- Metodos que requieran datos de entrada pero que no devuelvan datos de salida
    public static void restarNumeros(double a, double b){
        System.out.println("La resta de " + a + " y " + b + " = " + (a-b));
    }
    
    //3- Metodos que no requieran datos de entrada pero que sí devuelven datos de salida
    public static double multiplicarNumeros(){
        System.out.println("Ingrese a: ");
        double num1 = lector.nextDouble();
        System.out.println("Ingrese b: ");
        double num2 = lector.nextDouble();
        double producto = num1 * num2;
        return producto;
    }
    
    //4- Metodos que requieran datos de entrada y devuelvan datos de salida
    public static boolean verificarNumeros(int a, int b){
        return (a < b);
    }
}
