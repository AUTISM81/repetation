public class diceFunction {

    public static void main(String[] args) {

        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;
        double count5 = 0;
        double count6 = 0;

        for (int i = 0; i <= 10000; i++){
            int dice = rolling();

            System.out.println(dice);
                               if (dice == 1) {
                                   count1++;
            } else             if (dice == 2) {
                                   count2++;
            } else             if (dice == 3) {
                                   count3++;
            } else             if (dice == 4) {
                                   count4++;
            } else             if (dice == 5) {
                                   count5++;
            } else             if (dice == 6) {
                                   count6++;
            }
        }

        double average;

        average = count1/10000;
        System.out.println("average for rolling " + "1" + " is " + average);
        average = count2/10000;
        System.out.println("average for rolling " + "2" + " is " + average);
        average = count3/10000;
        System.out.println("average for rolling " + "3" + " is " + average);
        average = count4/10000;
        System.out.println("average for rolling " + "4" + " is " + average);
        average = count5/10000;
        System.out.println("average for rolling " + "5" + " is " + average);
        average = count6/10000;
        System.out.println("average for rolling " + "6" + " is " + average);
    }

    public static int rolling(){
            int dice = (int) (Math.random() * 6 + 1);

            return dice;
    }
}
