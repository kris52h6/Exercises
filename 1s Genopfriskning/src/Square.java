public class Square {

    public static void main(String[] args) {
        Square sq = new Square();
        sq.printSquare(8);
    }

    public void printSquare(int number) {
         int[] list = new int[number];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
