package modelo;

/**
 * Clase Trabajador
 * La cramos abstracta por que no pueden existir Objetos de tipo Trabajaor
 * Nos obliga a crear clases hijas no abstractas: Mecánico y Vendedor
 */
//
public abstract class Trabajador {
    private final int id;
    private final String nombre;
    private double salarioBase;
    private int antiguedad;
    private double factorProductividad; // número que multiplica a la productividad de cada venta o reparación

    public Trabajador(int id, String nombre, double salarioBase, int antiguedad, double factorProductividad) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
        this.factorProductividad = factorProductividad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getFactorProductividad() {
        return factorProductividad;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setFactorProductividad(double factorProductividad) {
        this.factorProductividad = factorProductividad;
    }

    @Override
    public String toString() {  // Todo: refactorizar a modo StringBuilder
        return "Trabajador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                ", antiguedad=" + antiguedad +
                ", factorProductividad=" + factorProductividad +
                '}';
    }

    /**
     * Metodo abstracto para obligar a que las clases hijas lo implementen
     * Cacula el porcentaje de productividad multiplicando la antiguedad por el factor de productividad
     * @return devuelve el porcentaje de productividad del trabajador
     */
    public abstract double calcularProductividad();


    /**
     * Metodo que calcula el salario del trabajador dependiendo de:
     * - salario base
     * - reparaciones o ventas
     * - porcentaje de productividad
     */
    public abstract double calcularSalario();

}
