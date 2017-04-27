import javax.swing.JOptionPane;

/**
 * Una empresa de préstamos decidio cambiar su esquema de cobros
 * de la siguiente forma:
 * 
 * - Si el prestamo es de mas de $ 5000.00 pesos, lo cobra en tres mensualidades
 * - Si el prestamo es de menos de $ 1000.00 pesos, lo cobra en una sola mensualidad
 * - Si el prestamo es entre $ 2000.00 y $ 3000.00 pesos lo cobra en dos mensualidades
 * - En los demas casos, lo cobra en cinco mensualidades
 * - Adicionalmente, si el prestamo es de menos de $ 4000.00 pesos cobra el 12% de interes
 * en caso contrario cobra el 10% de interes.
 * 
 * El programa debe decir cuantas mensualidades deben págar el prestamo y de cuanto
 * es de cada mensualidad. Para ello, se debe calcular el valor total de la deuda con
 * interes y se divide está en mesualidades iguales.
 */
public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        /*Declaracion de varibles*/
        double monto_prestamo = 0.0;
        double monto_interes = 0.0;
        double monto_deuda = 0.0;
        int num_mensualidades = 0;
        double monto_mensualidad = 0.0;
        
        /*Entrada de datos*/
        monto_prestamo = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca el monto del prestamo."));
        
        /*Procesamiento*/
        // Calculando numero de mensualidades
        if (monto_prestamo > 5000.00) 
        {
            num_mensualidades = 3;
        }
        else if (monto_prestamo < 1000.00) 
        {
            num_mensualidades = 1;
        }
        else if (monto_prestamo >= 2000.00 && monto_prestamo <= 3000.00) 
        {
            num_mensualidades = 2;
        }
        else
        {
            num_mensualidades = 5;
        }
        // Aplicando el interes de acuerdo a la condición
        if (monto_prestamo <= 4000.00)
        {
            monto_interes = monto_prestamo * 0.12;
        }
        else
        {
            monto_interes = monto_prestamo * 0.10;
        }
        //Calculando el monto de la deuda
        monto_deuda = monto_prestamo + monto_interes;
        
        // Calculando el monto de las mensualidades
        monto_mensualidad = (monto_deuda / num_mensualidades);
        
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,"Montó de prestamo: $ "
                +monto_prestamo+" pesos\nDeuda: $ "+monto_deuda
                +" pesos\nMensualidades: "
                +num_mensualidades+"\nMontó de mensualidades: $"
                +monto_mensualidad+" pesos");
        
    }
}
