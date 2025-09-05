import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            // 지금 몇번 반복했는지 세주는거
            int count = 0;
            
            String[] condition = (br.readLine()).trim().split(" ");
            
            // 지금 그 원소가 어딨는지 번호
            int place = Integer.parseInt(condition[1]);

            // nums string 배열
            String[] nums = (br.readLine()).trim().split(" ");

            // queue 만들어서 넣었다 뺐다 할 예정
            LinkedList<Integer> num = new LinkedList<>();

            // 리스트 만들어서 원소 개수 저장 - 탐색 시간 감소
            int[] countNums = new int[10];

            // 타겟 숫자
            int target = -1;
            for (int j = 0; j < Integer.parseInt(condition[0]); j++) {
                int getNumtoINT = Integer.parseInt(nums[j]);
                num.add(getNumtoINT);
                countNums[getNumtoINT]++;
                if (place == j) {
                    target = getNumtoINT;
                }
            }
            while (true) {
                int poll = num.poll();
                
                // 더 높은 우선순위가 남아있는지 확인
                boolean hasHigher = false;
                for (int j = poll + 1; j < 10; j++) {
                    if (countNums[j] != 0) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    // 뒤로 보냄
                    num.offer(poll);
                    if (place == 0) {
                        place = num.size() - 1; // 타깃이 맨 앞이었다면 끝으로 이동
                    } else {
                        place--;
                    }
                } else {
                    // 인쇄
                    count++;
                    countNums[poll]--;

                    if (place == 0) {
                        sb.append(count).append("\n");
                        break;
                    } else {
                        place--;
                    }
                }
            }
        }
        System.out.print(sb);
    }   
}


// 671234