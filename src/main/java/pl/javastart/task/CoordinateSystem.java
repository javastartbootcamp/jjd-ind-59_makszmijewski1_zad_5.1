package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int X = scanner.nextInt();
        System.out.println("Podaj Y");
        int Y = scanner.nextInt();
        System.out.println("Punkt (" + X + ", " + Y + ") "
                + whichQuarter(X, Y));
    }

    public String whichQuarter(int X, int Y) {
        if (X == 0 && Y == 0)
            return "leży na środku układu współrzędnych";
        else if (Y == 0)
            return "leży na osi X";
        else if (X == 0)
            return "leży na osi Y";
        else if (X > 0 && Y > 0)
            return "leży w I ćwiartce układu współrzędnych";
        else if (X < 0 && Y > 0)
            return "leży w II ćwiartce układu współrzędnych";
        else if (X < 0 && Y < 0)
            return "leży w III ćwiartce układu współrzędnych";
        else
            return "leży w IV ćwiartce układu współrzędnych";
    }
}
