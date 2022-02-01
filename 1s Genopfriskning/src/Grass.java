import java.util.Scanner;

public class Grass {
    private final double grassGrowth = 0.8;

    public static void main(String[] args) {
        Grass grass = new Grass();

        Scanner sc = new Scanner(System.in);
        double firstInput = sc.nextDouble();
        double secondInput = sc.nextDouble();
        grass.daysTillCutting(firstInput, secondInput);
    }

    public void daysTillCutting(Double currentGrassHeight, Double maxGrassHeight) {
        int daysCount = 0;
        System.out.println("current height: " + currentGrassHeight);
        System.out.println("max height: " + maxGrassHeight);

        while (currentGrassHeight < maxGrassHeight) {
            currentGrassHeight += grassGrowth;
            daysCount++;
        }
        System.out.println("days till cutting: " + daysCount);
    }

}
