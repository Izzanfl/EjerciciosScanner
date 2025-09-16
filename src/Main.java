import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //192.168.109.31:8080/pista1

        // Ejercicio 1 Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en ºC");
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

        // Ejercicio 5 Scanner

        System.out.println("Ingresa la edad");
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("No puede entrar");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Necesita adulto");
        } else {
            System.out.println("Puede entrar solo");
        }

        // Ejercicio 6 Scanner

        System.out.println("Ingresa un color");
        sc.nextLine();
        String semaforo = sc.nextLine();
        if (semaforo.equals("rojo")) {
            System.out.println("Detente!");
        } else if (semaforo.equals("amarillo")) {
            System.out.println("Precaucion");
        } else if (semaforo.equals("Verde")) {
            System.out.println("Avanza");
        }

        // Ejercicio 7 Scanner

        System.out.println("Ingresa un numero secreto");
        //sc.nextLine();
        int numerosecreto = sc.nextInt();
        if (numerosecreto == 28) {
            System.out.println("El numero es correcto");
        } else if (numerosecreto < 27) {
            System.out.println("El numero es mayor");
        } else if (numerosecreto >= 29) {
            System.out.println("El numero es menor");
        }

        // Ejercicio 8 Scanner

        System.out.println("Ingresa la primera palabra");
        String palabra1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingresa la segunda palabra");
        String palabra2 = sc.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.println("Coinciden");
        } else {
            System.out.println("No coinciden");
        }

        // Ejercicio 9 Scanner

        System.out.println("Ingresa el primer voto (A, B o C): ");
        String voto1 = sc.nextLine();

        System.out.print("Ingresa el segundo voto (A, B o C): ");
        String voto2 = sc.nextLine();

        System.out.print("Ingresa el tercer voto (A, B o C): ");
        String voto3 = sc.nextLine();

        int votosA = 0, votosB = 0, votosC = 0;

        if (voto1.equals("A")) votosA++;
        if (voto1.equals("B")) votosB++;
        if (voto1.equals("C")) votosC++;

        if (voto2.equals("A")) votosA++;
        if (voto2.equals("B")) votosB++;
        if (voto2.equals("C")) votosC++;

        if (voto3.equals("A")) votosA++;
        if (voto3.equals("B")) votosB++;
        if (voto3.equals("C")) votosC++;

        if (votosA > votosB && votosA > votosC) {
            System.out.println("Ganó A con " + votosA + " votos.");
        } else if (votosB > votosA && votosB > votosC) {
            System.out.println("Ganó B con " + votosB + " votos.");
        } else if (votosC > votosA && votosC > votosB) {
            System.out.println("Ganó C con " + votosC + " votos.");
        } else {
            System.out.println("Hay empate");
        }

        // Ejercicio 10 Scanner

        System.out.println("Ingresa el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("Ingresa el segundo numero");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresa la operacion (+, -, *, /");
        String operacion = sc.nextLine();

        double resultado;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":

                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir entre cero");
                    return;
                }
                break;
            default:
                System.out.println("Operacionno valida");
                return;
        }
        System.out.println("El resultado es: " + resultado);

    }

    }