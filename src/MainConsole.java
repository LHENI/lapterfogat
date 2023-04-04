import java.util.Scanner;

/*
* File: MainConsole.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I-N
* Date: 2023-03-04
* Github: https://github.com/LHENI/lapterfogat.git
* Licenc: GNU GPL
*/

public class MainConsole {

    public MainConsole() {
        this.about();
        System.out.println("Feladat 366");
        System.out.println("-----------");
        String aStr = input("Lapátlója:");
        double diagonal = Double.parseDouble(aStr);
        Volume cube = new Volume();
        System.out.println("Térfogat");
        System.err.println(cube.calcVolume(diagonal));
    }

    public String input(String m){
        Scanner scanner = new Scanner(System.in);
        System.out.print(m + " ");
        String text = scanner.nextLine();
        return text;
    }

    public void about(){
        System.out.println("---------------------------------------");
        System.out.println("Laczkó Henrietta");
        System.out.println("Szoft I-I N");
        System.out.println("2023-04-04");
        System.out.println("---------------------------------------");
    }
}
