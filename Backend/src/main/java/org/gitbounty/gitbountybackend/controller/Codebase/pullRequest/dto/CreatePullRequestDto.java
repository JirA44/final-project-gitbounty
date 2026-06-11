public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            grid[i][i] = scanner.nextInt();
        }
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == grid[i + 1][j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "Yes" : "No");
    }
}