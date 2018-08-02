import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        /*
        int intNum = 0;
        intNum ++;
        intNum += 5;    // Ez egy komment *=  /=   %=
        double dub = 1.5;
        boolean bool = true;    // <, <= .....
        String name = "Alex";
        char firstchar = 'c';
        System.out.println(name);

        int number = 15;
        if (number < 10) {
            System.out.println("I am the if");
        } else {
            System.out.println("I am the else");
        }


        int i = 0;
        while (i < 10) {
            System.out.println("BADBOI is awesome");
            i++;
        }
        */

        Scanner nev = new Scanner (System.in); // Azt jelenti, hogy konzolrról fogok beolvasni
        String line = nev.nextLine();
        int number = nev.nextInt();
        System.out.println("Hello " + line + "!");
        System.out.println(number);
    }
}
