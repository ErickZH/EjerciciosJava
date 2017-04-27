import javax.swing.JOptionPane;

/**
 * Realice un programa en Java que calcule e imprima, para convertir
 * de grados Celsius a grados Fahrenheit cuya formula es:
 * 
 * F = 9/5(C + 32)
 * 
 * Comprobar el programa con los siguientes valores: 65, 70, -22
 * 
 */
public class Ejercicio9 
{
    public static void main(String [] args)
    {
        /*Declaración de variables*/
        double gradosC;
        double gradosF;
        
        /*Entrada de datos*/
        gradosC = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca el valor de los grados Celsius."));
        
        /*Procesamiento*/
        
        gradosF = (1.8 * (gradosC + 32));
        
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,"Grados Celsius: "+gradosC
                +"\nGrados Fahrenheit: "+gradosF);
    }
}
