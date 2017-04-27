import javax.swing.JOptionPane;

/**
 * Elaborar un programa en Java que permita determinar la cantidad total
 * a pagar por una llamada telefóica de N minutos introducido por el 
 * usuario, teniendo en cuenta lo siguiente:
 * - Las llamadas de 5 minutos o menos tienen un costo de $10.00 pesos.
 * - Cada minuto adicional despues de los 5 primeros minutos cuestan $2.00 pesos más
*/
public class Ejercicio2 
{
    public static void main(String [] args)
    {
        /*Declaración de variables*/
        int minutos = 0;
        int total = 10; // Inicializamos a 10 porque es el precio de una llamada en los primeros 5 minutos
        /*Entrada de datos*/
        minutos = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Introduce la N cantidad"
                        + " de minutos a hablar"));
        /*Procesamiento*/
        if (minutos <= 5) 
        {
           total = 10; 
        }
        else
        {
            //Restamos los primeros 5 minutos
            // el resultado lo multiplicaremos por 2
            minutos = minutos - 5;
            
            total = total + (minutos * 2);
        }
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,"El total a pagar es: $"+total+".00 pesos");
    }
}
