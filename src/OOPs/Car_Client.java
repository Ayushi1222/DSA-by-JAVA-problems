package OOPs;
import java.util.*;
public class Car_Client {
    public static void main(String[] args) {
        Cars[] arr=new Cars[5];
        arr[0] = new Cars(200, 10, "White");// price speed color
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");

        Arrays.sort(arr, new Comparator<Cars>() {

            @Override
            public int compare(Cars o1, Cars o2) {
                // TODO Auto-generated method stub
                return o1.speed - o2.speed;
            }
        });
//		Sort(ar);
        Display(arr);
    }
    public static void Display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static <T extends Comparable<T>> void Sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {// number of turn
            // working ke liye hai
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

}
