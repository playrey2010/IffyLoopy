import java.util.Scanner;

public class IffyLoopy {

    public static void main(String[] args) {
        String oneLine = "";
        Scanner sc = new Scanner(System.in);
        String sleepy = "y";
        boolean redEyes;
        String again = "y";


        while (!(again.equalsIgnoreCase("n") || again.equalsIgnoreCase("No"))) {
            System.out.print("Enter 5 words! Press enter after each one: ");
            for (int i = 0; i<5; i++) {
                oneLine += sc.next() + " ";
            }

            System.out.println(oneLine);
            sc.nextLine();


            System.out.println("Are your eyes red? ");
            sleepy = sc.next();
            if (sleepy.equalsIgnoreCase("y") || sleepy.equalsIgnoreCase("yes")) {
                redEyes = true;
            } else {redEyes = false;}
            if (redEyes) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again (Type \"n\" or \"no\" to stop)? ");
            again = sc.next();
            oneLine = "";
        }

//        System.out.print("Enter 5 words! Press enter after each one: ");
//        for (int i = 0; i<5; i++) {
//            oneLine += sc.nextLine() + " ";
//        }
//        System.out.println(oneLine);
//
//
//        System.out.println("Are your eyes red? ");
//        if (sc.next().equalsIgnoreCase("y") || sc.nextLine().equalsIgnoreCase("yes")) {
//            redEyes = true;
//        } else {redEyes = false;}
//        if (redEyes) {
//                System.out.println("Get some sleep!");
//        } else {
//                System.out.println("You look great!");
//        }
//        System.out.println("Do you want to try again (Type \"n\" or \"no\" to stop)? ");
//        again = sc.next();
    }
}
