package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int coordinateX = scanner.nextInt();
        System.out.println("Podaj Y");
        int coordinateY = scanner.nextInt();
        System.out.println("Punkt (" + coordinateX + ", " + coordinateY + ") "
                + whichQuarter(coordinateX, coordinateY));
    }

    public String whichQuarter(int coordinateX, int coordinateY) {
        if (coordinateX == 0 && coordinateY == 0) {
            return "leży na środku układu współrzędnych";
        }
        else if (coordinateY == 0) {
            return "leży na osi X";
        }
        else if (coordinateX == 0) {
            return "leży na osi Y";
        }
        else if (coordinateX > 0 && coordinateY > 0) {
            return "leży w I ćwiartce układu współrzędnych";
        }
        else if (coordinateX < 0 && coordinateY > 0) {
            return "leży w II ćwiartce układu współrzędnych";
        }
        else if (coordinateX < 0 && coordinateY < 0) {
            return "leży w III ćwiartce układu współrzędnych";
        }
        else {
            return "leży w IV ćwiartce układu współrzędnych";
        }
    }
}
