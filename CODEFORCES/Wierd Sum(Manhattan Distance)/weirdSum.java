class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 1, 2, 3 },
                { 2, 1, 1, 2 },
                { 3, 1, 2, 1 },
                { 1, 1, 2, 1 }
        };
        int R = 4;
        int C = 4;
        long ans = 0;
        long[] sumtoLast = new long[100000];
        long[] count = new long[100000];
        long[] last = new long[100000];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                int color = arr[r][c];
                sumtoLast[color] += (r - last[color]) * count[color];
                last[color] = r;
                count[color]++;
                ans = ans + sumtoLast[color];
            }
        }
        sumtoLast = new long[100000];
        count = new long[100000];
        last = new long[100000];

        for (int c = 0; c < C; c++) {
            for (int r = 0; r < R; r++) {
                int color = arr[r][c];
                sumtoLast[color] += (c - last[color]) * count[color];
                last[color] = c;
                count[color]++;
                ans = ans + sumtoLast[color];
            }
        }
        System.out.println(ans);
    }
}