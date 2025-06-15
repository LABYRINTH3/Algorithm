import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(sc.next());
        int standard = Integer.parseInt(sc.next());
        for (int i = 0; i < num; i++) {
            int target = Integer.parseInt(sc.next());
            if(target < standard)
                list.add(target);
        }
        for (Integer item : list)
            System.out.print(item + " ");
    }
}