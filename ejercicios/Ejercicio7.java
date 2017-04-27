import javax.swing.JOptionPane;

/**
 * Realice un programa en Java que calcule e imprima la suma de dos números
 * dados por el teclado.
 * 
 */
public class Ejercicio7 
{
    public static void main(String [] args)
    {
        /*Declaracion de variables*/
        double num1;
        double num2;
        double suma;
        /*Entrada de datos*/
        num1 = Double.parseDouble(
        JOptionPane.showInputDialog(null, "Introduzca el primer valor a sumar."));
        
        num2 = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca el segundoo valor a sumar."));
        
        /*Procesamiento*/
        suma = num1 + num2;
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,num1+" + "+num2+" = "+suma);
    }
}
