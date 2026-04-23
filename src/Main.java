import modelo.Coche;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche miCoche;
        Scanner sc = new Scanner(System.in);

        System.out.println("Alta de coche: ");

        System.out.println("Dime el ID");



    }

    // Utilizamos métodos o clases estáticas (static) cuando no queremos instanciar un objeto de la clase para utilizar sus métodos
    public static int leerNumeroEntero(Scanner sc){
        int valorLeido;

        valorLeido = sc.nextInt();

        return valorLeido;
    }

    public static double leerNumeroReal(Scanner sc){
        double valorLeido;

        valorLeido = sc.nextDouble();

        return valorLeido;
    }

    public static String leerTextoSinEspaciosAlrededor(Scanner sc){
        String cadenaLeida;

        cadenaLeida = sc.nextLine();

        cadenaLeida = cadenaLeida.trim();

        return cadenaLeida;
    }

    /**
     * Lee los datos de un coche en el siguiente formato:
     * id;matricula;marca;modelo;potencia;km;precio;cantidadReparaciones
     * Sin espacios en ningún sitio
     * Caracter separador es el punto y coma (;)
     * @param sc
     * @return objeto Coche
     */
    public static Coche leerDatosDeCocheEnUnaLinea(Scanner sc){



    }






}