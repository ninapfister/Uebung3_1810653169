import javax.swing.*;

public class Aufruf
{
    public static void main (String []args)
    {
        Vehicle auto1 = new Vehicle (); //2 Objekte vom Typ Vehicle
        Vehicle auto2 = new Vehicle();

        auto1.name = "Audi"; // mit unterschiedlichen Werten
        auto2.name = "BMW";

        JOptionPane.showMessageDialog(null, "Ein " + auto1.name + " hat"); //die Operationen werden aufgerufen
        Vehicle.calculatePower(200); // bestimmt den Wert, mit dem ich rechnen muss

        JOptionPane.showMessageDialog(null, "Ein " + auto2.name + " hat"); // die Operationen werden aufgerufen
        Vehicle.calculatePower(220); // bestimmt den Wert, mit dem rechnen muss
    }
}
