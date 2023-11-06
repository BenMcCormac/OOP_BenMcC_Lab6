package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayDemo
{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int x;
        int[] anArray;
        anArray = new int[10];

        for(x=0;x<10;x++)
        {
            anArray[x] = x*100+100;
            System.out.println("Element at index " + x + ": " + anArray[x]);
        }

        System.out.println("Please enter the next variable: ");
        anArray[10] = Inpuq(scanner.nextInt());
    }
    int Inpuq(int q)
    {
        return q;
    }
}