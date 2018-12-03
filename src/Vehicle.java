import javax.swing.*;

public class Vehicle
{
    int power; // Attribute
    double weight;
    String name;


    public static String printName(String name) //Methode
    {
        return name; //Rückgabewert
    }

    public static void calculatePower(int power) //Methode
    {
        double ergebnis = power*1.36; // Umrechnung
        JOptionPane.showMessageDialog(null, "Das entspricht " + ergebnis +" ps"); // ohne Rückgabewert ausgeben, mit JOptionPane
    }
}

