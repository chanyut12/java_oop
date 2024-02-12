public class ArrayExample2 {
    public static void main(String[] args) {
        double[] myList = new double[5];
        myList[0] = 3.0;
        myList[1] = 4.0;

        for (int i = 2; i < 5; i++) {
            myList[i] = myList[i - 1] * myList[i - 2];

            if (i > 3) {
                myList[i] = myList[i] / 4;
            }
        }
        System.out.println(java.util.Arrays.toString(myList));

        for ( double i : myList) {
            System.out.println(i);
        }

    }
}

