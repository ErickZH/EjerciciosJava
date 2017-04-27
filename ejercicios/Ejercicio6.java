
import javax.swing.JOptionPane;

/**
 * La Dirección General de Transito en el Estado de Guerrero
 * necesita un programa en Java que mida el indice alcoholico;
 * dado por el tipo de vehiculo que conduce un conductor,
 * determine si da positivo en el control de alcoholimetro o no.
 * La tasa maxima de alcohol segun el tipo de vehiculo se resume
 * en la siguiente tabla
 * 
 * +------------+-----------+-------------+
 * + Vehiculo   + Indicador + Tasa maxima +
 * +------------+-----------+-------------+
 * + Camion     + C         +     0.3     +
 * +------------+-----------+-------------+
 * + Autobus    + A         +     0.3     +
 * +------------+-----------+-------------+
 * + Turismo    + T         +     0.5     +
 * +------------+-----------+-------------+
 * +Motocicleta + M         +     0.3     +
 * +------------+-----------+-------------+
 * 
 * El programa debe solicitar el tipo de vehiculo que se conduce (Indicador)
 * y el indice alcoholico del conductor.
 */
public class Ejercicio6 
{
    public static void main(String[] args) 
    {
        /*Declaracion de variables*/
        String tipo_vehiculo = "";
        double indice_alcoholico = 0.0;
        String salida = "";
        /*Entrada de datos*/
        tipo_vehiculo = JOptionPane.showInputDialog(null,"Introduzca el tipo de vehículo.");
        
        indice_alcoholico = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca el indice alcohólico del conductor."));
        
        /*Procesamiento*/
        if (tipo_vehiculo.equals("C")) 
        {
            if (indice_alcoholico >= 0.3) 
            {
                salida = "Positvo.";
            }
            else
            {
                salida = "Negativo.";
            }
        }
        else if (tipo_vehiculo.equals("A"))
        {
            if (indice_alcoholico >= 0.3) 
            {
               salida = "Positvo.";
            }
            else
            {
                salida = "Negativo.";
            }
        }
        else if (tipo_vehiculo.equals("T")) 
        {
            if (indice_alcoholico >= 0.3) 
            {
               salida = "Positvo.";
            }
            else
            {
                salida = "Negativo.";
            }
        }
        else if (tipo_vehiculo.equals("M")) 
        {
            if (indice_alcoholico >= 0.5) 
            {
               salida = "Positvo.";
            }
            else
            {
                salida = "Negativo.";
            }
        }
        else
        {
            salida = "Tipo de vehiculo no encontrado.";
        }
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,salida);
    }
}
