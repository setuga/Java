package com.github.setuga.java;

import java.util.Scanner;

class LeapYear
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year!");
        System.out.println("Example: 2015");
        while (scanner.hasNextLine())
        {
            String readLine = scanner.nextLine();
            readLine = readLine.trim();
            if (isNumber(readLine))
            {
                int year = Integer.parseInt(readLine);
                if (year != 0)
                {
                    if (divisibleBy4(year))
                    {
                        if (divisibleBy100(year))
                        {
                            if (divisibleBy400(year))
                            {
                                System.out.println(year + " is a leap year");
                                continue;
                            }
                            System.out.println(year + " is not a leap year");
                            continue;
                        }
                        System.out.println(year + " is a leap year");
                    }
                    else
                    {
                        System.out.println(year + " is not a leap year");
                    }
                }
                else
                {
                    System.out.println(year + " is not a leap year");
                }
            }
            else
            {
                System.out.println("Please enter a number of range of 0 - 2147483647");
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

    private static boolean divisibleBy4(int number)
    {
        return number % 4 == 0;
    }

    private static boolean divisibleBy100(int number)
    {
        return number % 100 == 0;
    }

    private static boolean divisibleBy400(int number)
    {
        return number % 400 == 0;
    }

}
