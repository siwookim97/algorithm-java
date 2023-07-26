package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GBC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] checkSector = new int[N][2];
        int[][] realSector = new int[M][2];

        int checkHeight = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int sector = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            checkHeight += sector;
            checkSector[i][0] = checkHeight;
            checkSector[i][1] = speed;
        }

        int realHeight = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sector = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            realHeight += sector;
            realSector[i][0] = realHeight;
            realSector[i][1] = speed;
        }

        int maxDifference = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = index; j < M; j++) {
                if (checkSector[i][0] > realSector[j][0] && checkSector[i][1] - realSector[j][1] < 0) {
                    maxDifference = Math.max(maxDifference, realSector[j][1] - checkSector[i][1]);
                    System.out.println("maxDifference1 = " + maxDifference);
                    System.out.println("j + i = " + j + i);
                } else if (checkSector[i][0] < realSector[j][0] && checkSector[i][1] - realSector[j][1] < 0) {
                    maxDifference = Math.max(maxDifference, realSector[j][1] - checkSector[i][1]);
                    System.out.println("maxDifference2 = " + maxDifference);
                    System.out.println("j + i = " + j + i);
                    break;
                } else if (checkSector[i][0] == realSector[j][0]){
                    maxDifference = Math.max(maxDifference, realSector[j][1] - checkSector[i][1]);
                    System.out.println("maxDifference3 = " + maxDifference);
                    System.out.println("j + i = " + j + i);
                    index++;
                    break;
                } else {
                    System.out.println("j + i = " + j + i);
                    index++;
                    break;
                }
            }
        }

        System.out.println(maxDifference);
    }
}
