import java.util.Scanner;


//3 6 1
//###*OO
//O#OA%O
//###*OO
//2 3 2 1


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nmk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmk[0]);

        int m = Integer.parseInt(nmk[1]);

        int k = Integer.parseInt(nmk[2]);
        char grid[][] = new char[n][m];
        for (int nItr = 0; nItr < n; nItr++) {
            String row = scanner.nextLine();

            // Write Your Code Here
            grid[nItr] = row.toCharArray();
            
        }
        
//        System.out.println(grid[0]);
        for (int kItr = 0; kItr < k; kItr++) {
            String[] i1J1I2J2 = scanner.nextLine().split(" ");

            int i1 = Integer.parseInt(i1J1I2J2[0]);

            int j1 = Integer.parseInt(i1J1I2J2[1]);

            int i2 = Integer.parseInt(i1J1I2J2[2]);

            int j2 = Integer.parseInt(i1J1I2J2[3]);

            // Write Your Code Here

        }
        // Write Your Code Here
        // System.out.println(0.25);

        scanner.close();
    }
}
