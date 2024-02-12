public class ArrayExample {
    public static void main(String[] args) {
        int[] list = new int[10]; 
        for (int i = 0; i < 5; i++) { 
            list[i] = i * i - 5;
            if (i % 3 == 0) {
                list[i] = list[i] + i; 
            } else {
                list[i] = list[i] - i;
            }
        }
        System.out.println(java.util.Arrays.toString(list));
    }
}
