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
        System.out.println("2023-02-20");
        System.out.println("---------------------------------------");
    }
}
