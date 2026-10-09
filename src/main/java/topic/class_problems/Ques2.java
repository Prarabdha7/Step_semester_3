public class Ques2 {

    public static Object[] warehouseSummary(int[][] grid) {
        int totalItems = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                totalItems += grid[i][j];

                if (grid[i][j] > maxValue) {
                    maxValue = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Object[]{
            totalItems,
            new int[]{maxRow, maxCol}
        };
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };

        Object[] result = warehouseSummary(grid);
        int[] coordinate = (int[]) result[1];

        System.out.println(
            "(" + result[0] + ", (" +
            coordinate[0] + ", " +
            coordinate[1] + "))"
        );
    }
}