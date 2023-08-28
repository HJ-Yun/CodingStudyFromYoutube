package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //ANSI : American Code

        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        c = 'B';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        System.out.println("---------------");

        c = '1';
        System.out.println(c);
        System.out.println((int) c);

        c = '2';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        //'A' starts from 65
        //'a' starts from 97
        //'0' starts from 48

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
