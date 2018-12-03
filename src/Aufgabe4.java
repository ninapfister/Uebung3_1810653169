public class Aufgabe4
{
    public static void main (String[]args)
    {
        System.out.println(fibonacciRekursiv(8));
        System.out.println(fibonacciIterativ(8));

    }
    public static int fibonacciRekursiv(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
      return fibonacciRekursiv (n-2) + fibonacciRekursiv(n-1);
    }

    public static int fibonacciIterativ(int n)
    {
        if (n<=1)
        {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++)
        {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}

// rekursiv wiederholt sich selbst und braucht mehr Speicher, deshalb dauert es länger
// interativ ist schneller und effezienter, braucht weniger Speicher, ist aber mehr komplex