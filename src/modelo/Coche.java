package modelo;

public class Coche {
    private final int id;
    private String matricula;
    private final String marca;
    private final String modelo;
    private int potencia; //CV
    private int km;
    private double precio;
    private int cantidadReparaciones;


    public Coche(int id, String matricula, String marca, String modelo, int potencia, int km, double precio) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.km = km;
        this.precio = precio;
        this.cantidadReparaciones = 0;
    }

    // los getters son (generalmente) públicos, devuelven valores, y no reciben nada
    public int getId(){
        return this.id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getKm() {
        return km;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadReparaciones() {
        return cantidadReparaciones;
    }

    // Setters no creamos setters para todos los atributos, sólamente para los que pueden cambiar
    // devuelven: nada
    // reciben: el nuevo valor correspondiente

    /**
     * Establece el nuevo precio del coche
     * No devuelve nada
     * @param precio nuevo precio a establecer
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setCantidadReparaciones(int cantidadReparaciones) {
        this.cantidadReparaciones = cantidadReparaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Coche: ");

        sb.append(String.format("id= %d", id));
        sb.append(String.format("matricula=' %s",  matricula ));
        sb.append(String.format("marca=' %s",  marca ));
        sb.append(String.format("modelo=' %s",  modelo ));
        sb.append(String.format("potencia= %d",  potencia));
        sb.append(String.format("km= %d",  km));
        sb.append(String.format("precio= %.2f",  precio));
        sb.append(String.format("cantidadReparaciones= %d",  cantidadReparaciones));

        return sb.toString();
    }
}
