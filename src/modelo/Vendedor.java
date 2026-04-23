package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase hija de Trabajador
 */
public class Vendedor extends Trabajador {
    private List<Coche> cochesVendidos;

    public Vendedor(int id, String nombre, double salarioBase, int antiguedad, double factorProductividad) {
        super(id, nombre, salarioBase, antiguedad, factorProductividad);
        this.cochesVendidos = new ArrayList<>();
    }

    /**
     * Metodo que calcula el salario del trabajador dependiendo de:
     * - salario base
     * - reparaciones o ventas
     * - porcentaje de productividad
     */
    @Override
    public double calcularSalario() {
        double salario;

        salario = super.getSalarioBase() + super.calcularPorcentajeProductividad() * this.cochesVendidos.size();

        return salario;
    }

    public Coche buscarCochePorId(int idBuscado){
        Coche cocheEncontrado = null;
        Coche temporal;
        int posicion = 0;
        int cantidad = this.cochesVendidos.size();

        // condicion entrada && condición continuidad && condición finalización
        while( cantidad > 0 && cocheEncontrado == null && posicion < cantidad ){

            temporal = this.cochesVendidos.get(posicion);

            if( temporal.getId() == idBuscado ){
                cocheEncontrado = temporal;
            }
            posicion++;
        }
        return cocheEncontrado;
    }

    public void addCocheVendido(Coche coche){
        this.cochesVendidos.add(coche);
    }

    public Coche retirarVentaCoche(int idCoche){
        return null;
    }


}
