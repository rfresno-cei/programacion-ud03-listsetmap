import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio9();
    }

    public static void ejercicio1() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Rodrigo");
        nombres.add("Antonio");
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(4));
        System.out.println(nombres.size());
    }

    public static void ejercicio2() {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        double media = (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4)) / notas.size();
        System.out.println(media);
        if (media >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }

    public static void ejercicio3() {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Violeta");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce color: ");
        String color = sc.nextLine();
        if  (colores.contains(color)) {
            System.out.println("El color está en la lista");
        } else {
            System.out.println("El color no está en la lista");
        }
    }

    public static void ejercicio4() {
        HashSet<String> dnis = new HashSet<>();
        dnis.add("19283746T");
        dnis.add("19283746Z");
        dnis.add("19283747Z");
        dnis.add("19283748Z");
        dnis.add("19283746Z");
        System.out.println(dnis.size());
        System.out.println(dnis.contains("19283746T"));
    }

    public static void ejercicio5() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Rodrigo");
        nombres.add("Antonio");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        if (nombres.contains(nombre)) {
            System.out.println("Ya existe");
        } else {
            nombres.add(nombre);
            System.out.println(nombres);
        }
    }

    public static void ejercicio6() {
        HashSet<Integer> numeros1 = new HashSet<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros1.add(4);
        HashSet<Integer> numeros2 = new HashSet<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(5);
        if (numeros1.size() > numeros2.size()) {
            System.out.println("La primera lista es más larga");
        } else if (numeros1.size() < numeros2.size()) {
            System.out.println("La segunda lista es más larga");
        } else {
            System.out.println("Son iguales");
        }
    }

    public static void ejercicio7() {
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Brandon", 3);
        personas.put("Daniel", 2);
        personas.put("Carlos", 1);
        personas.put("Rafa", 1);
        personas.put("Terry", 8);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        if (personas.containsKey(nombre)) {
            int edad =  personas.get(nombre);
            boolean esMayor = edad >= 18;
            System.out.println("Edad: " + edad);
            System.out.println("Es mayor: " + esMayor);
        }
    }

    public static void ejercicio8() {
        HashMap<String, Double>  notas = new HashMap<>();
        notas.put("Terry", 7.5);
        notas.put("Carlos", 10.0);
        notas.put("Rafa", 10.0);
        notas.put("Daniel", 2.0);
        notas.put("Julián", 1.5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        if (notas.containsKey(nombre)) {
            System.out.println("Nota media: " + notas.get(nombre));
            System.out.println("Aprobado: " + (notas.get(nombre) >= 5.0));
        }
    }

    public static void ejercicio9() {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("Julián", "capi21capi");
        usuarios.put("Carlos", "carlos123");
        usuarios.put("Nerea", "2240");
        usuarios.put("Nacho", "583");
        usuarios.put("Isa", "spiderman123");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce contraseña: ");
        String password = sc.nextLine();
        if (usuarios.containsKey(nombre)) {
            if (usuarios.get(nombre).equals(password)) {
                System.out.println("Login correcto");
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
            }
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }
    }
}