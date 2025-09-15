import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Ejercicio 1 Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingresa la temperatura en ºC");
        int temperatura = sc.nextInt();

        if (temperatura < 0) {
            System.out.println("Hace frio");
        } else if (temperatura > 30) {
            System.out.println("hace calor");
        } else {
            System.out.println("Clima templado");
        }


        // Ejercicio 2 Scanner

        System.out.println("Ingresa un color");
        sc.nextLine();
        String color = sc.nextLine();
        if (color.equals("rojo") || color.equals("azul") || color.equals("verde")) {
            System.out.println("Es un color primario");
        } else {
            System.out.println("Otro color");
        }

        // Ejercicio 3 Scanner

        System.out.println("Ingresa la velocidad de un coche");
        //sc.nextLine();
        int velocidad = sc.nextInt();
        if (velocidad > 120) {
            System.out.println("Multa");
        } else {
            System.out.println("Velocidad correcta");
        }

        // Ejercicio 4 Scanner

        System.out.println("Ingresa un animal");
        sc.nextLine();
        String animal = sc.nextLine();
        if (animal.equals("perro") || animal.equals("gato")) {
            System.out.println("Domestico");
        } else if (animal.equals("tigre") || animal.equals("león")) {
            System.out.println("Salvaje");
        } else {
            System.out.println("No Clasificado");
        }





































    }

}