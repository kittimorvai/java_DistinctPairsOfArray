package mypackage;

public class Main {

    public static int[] numbers = {8, 12, 16, 4, 0, 20};
    public static int difference = 4;

    public static void main(String[] args) {

        findPairs(numbers, difference);
    }

    public static void findPairs(int[] array, int difference) {
        System.out.println("The difference is equal to " + difference + " in case of the following distinct numbers:");
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[i] - array[j] == difference) {
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }

}
