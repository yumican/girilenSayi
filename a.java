import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int b;
        int d = 0;
        int g=0;

        Scanner keyboard = new Scanner(System.in);
        b = keyboard.nextInt();


        for(int c = 12;c <= b; c+=12){
            g+=c;
            d++;
        }
        System.out.println((double)g/d);
        }
    }

