
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoDiazGutierrezHelio2223 miVehiculoDiazGutierrezHelio2223;
        int stockActual;
        
        miVehiculoDiazGutierrezHelio2223 = new VehiculoDiazGutierrezHelio2223("Seat",18000,100);
        operativaVehiculosDiazGutierrezHelio2223(miVehiculoDiazGutierrezHelio2223, 50); 
        stockActual = miVehiculoDiazGutierrezHelio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosDiazGutierrezHelio2223(VehiculoDiazGutierrezHelio2223 miVehiculoDiazGutierrezHelio2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoDiazGutierrezHelio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoDiazGutierrezHelio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
