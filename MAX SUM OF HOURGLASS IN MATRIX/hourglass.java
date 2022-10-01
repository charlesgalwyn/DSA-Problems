class Main {
    public static void main(String[] args) {
      int [][]mat =     {{1, 1, 1, 0, 0, 0},
                         {0, 1, 0, 0, 0, 0},
                         {1, 1, 1, 0, 0, 0},
                         {0, 0, 2, 4, 4, 0},
                         {0, 0, 0, 2, 0, 0},
                         {0, 0, 1, 2, 4, 0}};
      int res = findMaxSum(mat,6,6);
      System.out.println(res);
    }
    public static int findMaxSum(int [][]mat,int r,int c){
      int max_sum = Integer.MIN_VALUE;
      for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
          if (i+2<mat.length && j+2<mat[0].length){
            int sum = (mat[i][j] + mat[i][j + 1] +
                         mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                         (mat[i + 2][j] + mat[i + 2][j + 1] +
                         mat[i + 2][j + 2]);
  
            max_sum = Math.max(max_sum, sum);
          }
        }
      }
      return max_sum;
    }
  }
