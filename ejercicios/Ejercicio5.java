
import javax.swing.JOptionPane;

/**
 * En una empresa cada empleado debe teclear un código 
 * identificador de 3 cifras en la entrada. Escribir un programa en Java
 * que muestre por pantalla la categoria del empleado
 * teniendo en cuenta que:
 * 
 * - Si el codigo es divisible por 2, por 3 y por 5, la categoria del empleado
 * es "Director general".
 * - Si el codigo es divisible por 3 y por 5 pero no por 2, la categoria del empleado
 * es "Directivo".
 * - Si el codigo es divisible por 2, pero no por 3 ni por 5, la categoria del empleado es "Staff".
 * - Si el codigo no es divisible por 2, ni por 3 ni por 5, la categoria del empleado es
 * "Seguridad"
 *
 */
public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        /*Declaración de variables*/
        int codigo = 0;
        String categoria = "";
        /*Entrada de datos*/
        codigo = Integer.parseInt(
        JOptionPane.showInputDialog(null,"Introduzca el código de identificador."));
        
        /*Procesamiento*/
        if ( (codigo % 2 == 0) && (codigo % 3 == 0) && (codigo % 5 == 0) ) 
        {
            categoria = "Director general";
        }
        else if ( ((codigo % 3 == 0) && (codigo % 5 == 0)) && (!(codigo % 2 == 0)) ) 
        {
            categoria = "Directivo";
        }
        else if ((codigo % 2 == 0) && (!(codigo % 3 == 0)) && (!(codigo % 5 == 0))) 
        {
            categoria = "Staff";
        }
        else if ( (!(codigo % 2 == 0)) && (!(codigo % 3 == 0)) && (!(codigo % 5 == 0)) ) 
        {
            categoria = "Seguridad";
        }
        else
        {
            categoria = "Código no valido";
        }
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,categoria);
    }
}
