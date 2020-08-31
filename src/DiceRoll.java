public class DiceRoll {
    public static void main(String[] args) {
        rolling();
    }

    public static void rolling(){
        int count = 0;
        for (int i = 0; i < 1;) {
            int dice = (int) (Math.random() * 6 + 1) * 2;
            count++;
            if (dice == 2) {
                i = 10;
                System.out.println("it took " + count + " times to roll snake eyes");
            }

        }
    }
}
