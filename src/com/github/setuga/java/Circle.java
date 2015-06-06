package com.github.setuga.java;

import java.util.Scanner;

class Circle
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of radius of circle!");
        System.out.println("Example: 10");
        while (scanner.hasNextLine())
        {
            String readLine = scanner.nextLine();
            readLine = readLine.trim();
            if (isNumber(readLine))
            {
                double areaOfCircle = Math.PI * Math.pow(Double.parseDouble(readLine), 2);
                double lengthOfCircle = 2 * Math.PI * Double.parseDouble(readLine);
                System.out.println("Area of circle is " + areaOfCircle);
                System.out.println("Length of circumference is " + lengthOfCircle);
            }
            else
            {
                System.out.println("Please enter a number!");
            }
        }
    }

    private static boolean isNumber(String number)
    {
        try
        {
            int n = Integer.signum(Integer.parseInt(number));
            if (n == 0 || n == 1) return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return false;
    }

}
