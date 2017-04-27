import javax.swing.JOptionPane;

/**
 *
 * Realice un programa en Java que calcule e imprima el area de un triangulo
 * y su perimetro el triangulo es equilatero
 * 
 * Formulas:
 * A = b * h / 2
 * 
 * P = l + l + l
 */
public class Ejercicio8 
{
    public static void main(String [] args)
    {
        /*Declaracion de variables*/
        double base;
        double altura;
        double area;
        double perimetro;
        
        /*Entrada de datos*/
        base = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca la base del triángulo equilátero."));
        
        altura = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Introduzca la altura del triángulo equilátero"));
        
        /*Procesamiento*/
        area = (base * altura) / 2;
        
        perimetro = base + base + base;
        
        /*Salida de datos*/
        JOptionPane.showMessageDialog(null,"Área: "+area+"\nPerimetro: "+perimetro);
    }
}
