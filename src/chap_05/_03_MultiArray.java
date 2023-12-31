package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String []seatA = {"A1", "A2", "A3", "A4", "A5"};
        String []seatB = {"B1", "B2", "B3", "B4", "B5"};
        String []seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        }; // 3x5 array
        //B2?
        System.out.println(seats[1][1]);
        //C5?
        System.out.println(seats[2][4]);

        // 1st line : 3, 2nd line : 4, 3rd line : 5
        String[][] seats2 = {
                {"A1", "A2,", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //A3?
        System.out.println(seats2[0][2]);
        //A5?
        //System.out.println(seats2[0][4]); // Error
    }
}
