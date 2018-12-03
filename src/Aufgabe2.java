import javax.swing.*;

public class Aufgabe2
{
    public static void main (String[]args)
    {
        // zu Aufgabe 3, zwei Variablen festlegen
        int a = 10;
        int b = 20;

        System.out.println(Taschenrechner.addieren (a,b)); // Werte ausgeben, mit Taschenrechner kann man auf andere Klasse zugreifen, Punkt bestimmt etwas genauer
        System.out.println(Taschenrechner.subtrahieren(a,b));
        System.out.println(Taschenrechner.multiplizieren (a,b));
        System.out.println(Taschenrechner.dividieren (a,b));

        double c = 5.5; // zwei Variablen festlegen
        double d = 7.5;

        System.out.println(Taschenrechner.addieren1 (c,d)); // Werte ausgeben, mit Taschenrechner kann man auf andere Klasse zugreifen, Punkt bestimmt etwas genauer
        System.out.println(Taschenrechner.subtrahieren1 (c,d));
        System.out.println(Taschenrechner.multiplizieren1(c,d));
        System.out.println(Taschenrechner.dividieren1(c,d));

        // Aufgabe 2
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
            String length1 = a.substring(lenght/2); // mit dem Punkt kann man etwas genauer bestimmen, substring um den Wert von vorher herauszuheben, um einen String aus einem größeren String herauszulesen, 2 für die 2.Hälfte vom Wert
            System.out.println(length1); // die Länge wird ausgegeben
        }
    }
}
