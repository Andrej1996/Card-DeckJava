public class CardTest {
    public static void main(String[] args) {

        CardSuit[] firstPrint = CardSuit.values();

        for (int i = 0; i < firstPrint.length; i++) {
            System.out.print(firstPrint[i]);
            if (i < CardSuit.values().length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        CardRank[] secondPrint = CardRank.values();

        for (int i = 0; i < secondPrint.length; i++) {
            System.out.print(secondPrint[i]);
            if (i < CardRank.values().length - 1) {
                System.out.print(", ");
            }
        }
    }
}
