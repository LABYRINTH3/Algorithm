
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int[] hotelInfo = new int[3*iteration];
        for (int j = 0; j < iteration; j++) {
            hotelInfo[0+3*j] = sc.nextInt();
            hotelInfo[1+3*j] = sc.nextInt();
            hotelInfo[2+3*j] = sc.nextInt();
            // 층 수, 각 층의 방 수, 몇 번째 손님
        }
        sc.close();

        for (int i = 0; i < iteration; i++) {
            int roomNum = 1;
            int guestNum = hotelInfo[2+3*i];
            while (hotelInfo[0+3*i] < guestNum) {
                guestNum -= hotelInfo[0+3*i];
                roomNum += 1;
            }
            System.out.print(guestNum);
            if (roomNum > 9) {
                System.out.println(roomNum);
            }
            else{
                System.out.print("0");
                System.out.println(roomNum);
            } 
        }
    }
}
