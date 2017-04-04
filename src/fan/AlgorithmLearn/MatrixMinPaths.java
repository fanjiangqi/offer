package fan.AlgorithmLearn;

import java.util.List;

/**
 * Created by fanjiangqi on 2017/4/1.
 * 矩阵最小路径和
 * 动态规划问题，中级（但是，个人感觉是贪心算法问题）
 * 问题转换：状态定义和状态转移方程
 */
public class MatrixMinPaths {
    public static int matrixMinPaths(int[][] arr){
        int rows = arr.length; //矩阵行数
        int cols = arr[0].length; //矩阵列数
        int[][] paths = new int[rows][cols]; //到第paths[i][j] 点的最短路径和
        paths[0][0] = arr[0][0];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (i ==0 && j==0) //arr[0][0]不用计算，前面已经定义
                    continue;
                if (i == 0 || j ==0){ //第0行，和第0列处理
                    if (i == 0){
                        paths[i][j] = paths[0][j-1] + arr[0][j];
                    }
                    else{
                        paths[i][j] = paths[i-1][0] + arr[i][0];
                    }
                }
                else {
                    if (paths[i][j-1] > paths[i-1][j]){
                        paths[i][j] = paths[i-1][j] + arr[i][j];
                    }
                    else {
                        paths[i][j] = paths[i][j-1] + arr[i][j];
                    }
                }

            }
        }

        return paths[rows-1][cols-1];
    }


    public static void main(String[] args) {
        int[][] arr = {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(matrixMinPaths(arr));
    }
}
