import javax.swing.JOptionPane;

/**
 *
 * Realice un programa en Java que Calcule e Imprima el volumen y el área
 * de una esfera utilizando las formulas.
 * 
 * V = 4 * pi * r^3 / 3
 * 
 * A = 4 * pi * r^2
 * 
 * Comprobar el programa utilizando los valores del radio: 1.6, 12.2 y 0.2
 */
public class Ejercicio10 
{
    public static void main(String [] args)
    {
        /*Declaracion de variables*/
        double radio;
        double volumen;
        double area;
        final double PI = 3.1416;
        /*Entrada de datos*/
        radio = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca el radio de la esfera"));
        
        /*Procedimiento*/
        volumen = (4 * PI * (radio * radio * radio)) / 3;
        
        area = (4 * PI * (radio * radio));
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,"Radio: "+radio+"\nVolumen: "+volumen
                +"\nÁrea: "+area);
        
    }
}
