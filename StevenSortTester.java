import java.util.*;
public class StevenSortTester{
    public static void main(String[] args) {
        Random rng1 = new Random();
        int test1 [] = new int[10];
        for(int i = 0; i < test1.length; i++){
            test1 [i] = rng1.nextInt(1000);
        }
        Arrays.sort(test1);
        System.out.println(Arrays.toString(test1));
        Sorts.bubbleSort(test1);
        System.out.println(Arrays.toString(test1));
        
    }
}
