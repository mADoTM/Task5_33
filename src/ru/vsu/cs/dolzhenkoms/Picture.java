package ru.vsu.cs.dolzhenkoms;

public class Picture {
    private int size;

    public Picture(int size) {
        this.size = size;

        if(size < 4)
            this.size = 4;
        else if((size - 1) % 3 != 0)
            this.size = 4;
    }

    public void printPicture() {
        int countUnderlines = (size - 4) / 3;
        int countEmpties = (size - 2 - countUnderlines) / 2;

        System.out.println(countUnderlines);
        System.out.println(countEmpties);

        for(int i = 0; i < size; i++) {
            if(i == 0 || i == size - 1) {
                printEmpties(countEmpties);
                printLink(countUnderlines);
                printEmpties(countEmpties);
            }
            else if(i == countUnderlines + 1 || i == size - countUnderlines - 2) {
                printLink(countUnderlines);
                printEmpties(countUnderlines);
                printLink(countUnderlines);

            }
            else if((i > countUnderlines + 1) && (i < size - countUnderlines - 2)) {
                System.out.print("|");
                printEmpties(size -  2);
                System.out.print("|");
            }
            else {
                printEmpties(countEmpties);
                System.out.print("|");
                printEmpties(countUnderlines);
                System.out.print("|");
                printEmpties(countEmpties);
            }
            System.out.println();
        }
    }

    private static void printEmpties(int countEmpties) {
        for(int i = 0; i < countEmpties; i++)
            System.out.print(" ");
    }

    private static void printLink(int countUnderlines) {
        System.out.print("*");
        for(int i = 0; i < countUnderlines; i++)
            System.out.print("");
        System.out.print("*");
    }
}
