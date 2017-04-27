import javax.swing.JOptionPane;

/**
 * El dueño de una papeleria desea un programa en Java que le indique
 * el precio de venta de un articulo. El precio se calcula de acuerdo
 * con la siguiente formula: 
 * PrecioVenta = precioCompra + ganancia
 * Donde la ganancia será:
 * - El 15% si el precio de compra es inferior a $3.00 pesos
 * - $0.50 centavos si el precio de compra está entre $3.00 y $6.00 pesos
 * - El 25% si el precio de compra supera los $6.00 pesos
 */
public class Ejercicio3 
{
    public static void main(String [] args)
    {
        /*Declaración de variables*/
        double precioCompra = 0.0;
        double precioVenta = 0.0;
        /*Entrada de datos*/
        precioCompra = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduce el precio de compra del articulo"));
        /*Procesamiento*/
        if (precioCompra < 3) 
        {
            precioVenta = precioCompra + 0.15;
        }
        else if (precioCompra >= 3 && precioCompra < 6)
        {
            precioVenta = precioCompra + 0.50;
        }
        else
        {
            precioVenta = precioCompra + 0.25;
        }
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null, "Precio de Venta: $"+precioVenta+" pesos");
    }
}
