import modelo.Coche;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche miCoche;
        Scanner sc = new Scanner(System.in);

        System.out.println("Alta de coche: ");

        miCoche = leerDatosDeCocheEnUnaLinea(sc);

        System.out.println(miCoche);

        System.out.println(miCoche.obtenerLetrasDeMatricula());
        System.out.println(miCoche.obtenerDigitosDeMatricula());
        System.out.println(miCoche.obtenerDigtosDeMatricula2());
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
        String cadenaLeida;
        String[] arrayCampos = new String[8];
        Coche coche;

        System.out.println("Dime los datos del coche en este formato: ");
        System.out.println("id;matricula;marca;modelo;potencia;km;precio");

        cadenaLeida = sc.nextLine();

        //id;matricula;marca;modelo;potencia;km;precio;cantidadReparaciones

        arrayCampos = cadenaLeida.split(";");

        //imprimirArrayStrings(arrayCampos);

        coche = new Coche( convertirStringAEntero(arrayCampos[0]),
                        arrayCampos[1],
                        arrayCampos[2],
                        arrayCampos[3],
                        convertirStringAEntero(arrayCampos[4]),
                        convertirStringAEntero(arrayCampos[5]),
                        convertirStringADouble(arrayCampos[6])
                );

        return coche;
    }

    public static void imprimirArrayStrings(String[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i] + "\t");
        }
    }

    private static int convertirStringAEntero(String cadena){
        return Integer.parseInt(cadena);
    }
    private static double convertirStringADouble(String cadena){
        return Double.parseDouble(cadena);
    }


}