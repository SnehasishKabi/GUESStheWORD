package cwh;
import java.util.Random;
import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] a= {"gupta","dhanu","bmsce","amogh","rinku","rohit","kohli"};
        Random random=new Random();
        int ran= random.nextInt(7);

        System.out.println("Enter 5 Lettter Word");
        System.out.println("You Will get 5 attempts ");
        String b = a[ran];
        int k;
        for(k=0;k<5;k++) {
            String userword = sc.next();
            int i, j;

            for (i = 0; i < 5; i++) {
                int c = 0;
                char ch = userword.charAt(i);
                for (j = 0; j < 5; j++) {

                    char ch1 = b.charAt(j);
                    if (ch == ch1) {
                        c++;
                        if (i == j)
                            System.out.println(ch + " " + "100");
                        else
                            System.out.println(ch + " " + "50");
                        break;
                    }

                }
                if (c == 0) {
                    System.out.println(ch + " " + "0");


                }


            }
        }

        System.out.println(b);
    }
}
