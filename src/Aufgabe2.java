import javax.swing.*;

public class Aufgabe2
{
    public static void main (String[]args)
    {
        partialString(JOptionPane.showInputDialog(null, "Bitte geben Sie einen Wert ein!")); // in main Methode aufrufen
    }
    public static void partialString (String a)
    {
        int lenght = a.length(); // mit dem Punkt kann man etwas genauer bestimmen, damit ich darauf zugreifen kann
        System.out.println(lenght); // die Länge vom Wert ausgeben
        if (lenght < 3) // wenn die Länge kleiner 3
        {
            System.out.println("Geben Sie einen längeren Wert ein!"); // dann wird das ausgegeben
        }
        else // sonst
        {
            String length1 = a.substring(2); // mit dem Punkt kann man etwas genauer bestimmen, substring um den Wert von vorher herauszuheben, um einen String aus einem größeren String herauszulesen, 2 für die 2.Hälfte vom Wert
            System.out.println(length1); // die Länge wird ausgegeben
        }
    }
}
