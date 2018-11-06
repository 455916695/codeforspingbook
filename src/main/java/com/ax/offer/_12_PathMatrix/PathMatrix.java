package com.ax.offer._12_PathMatrix;
/**
 * 12、矩阵中的路径
 *          题目描述
                 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
                 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
                 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
                 例如下面的矩阵包含了一条 bfce 路径。
 *
 * */
public class PathMatrix {

    private final static int[][] next = {{0,-1},{0,1},{-1,0},{1,0}};
    private int rows;
    private int cols;

    public  boolean hashPath(char[] array,int rows,int cols,char[] str){
        if(rows == 0 || cols == 0) {  //判断所传矩阵是否合法
            return  false;
        }

        this.rows = rows;
        this.cols = cols;
        boolean[][] marked = new boolean[rows][cols];
        char[][] matrix = buildMatrix(array);  //将传入的一维数组，转化为 二维数组
        for(int i = 0;i<rows;i++){
            for (int j = 0;j<cols;j++ ){
                if(backtracking(matrix,str,marked,0,i,j)) // 循环调用方法测试，能否找到一条正确的道路
                    return true;
            }
        }
        return false;
    }

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0,idx = 0;i<rows;i++)
            for (int j = 0 ; j<cols;j++)
                matrix[i][j] = array[idx++];
        return matrix;
    }

    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {

        if(pathLen == str.length) {
            return true;
        }

        //判断是否处于边境， 判断此处的字符是否符合要遍历的字符，判断此处是否被遍历
        if (r <0 || r >=rows || c<0 ||c >= cols || matrix[r][c] != str[pathLen] || marked[r][c])
            return  false;

        marked[r][c] = true;   //如果走到这里，说明，此处暂时满足目前的情况

        for (int[] n: next )  //遍历上下左右，去寻找下一个路径
            if(backtracking(matrix,str,marked,pathLen+1,r+n[0],c+n[1]))
                return  true;

        //如果走到这一步，说明没有找到合适的路径，就放弃这一次寻找的结果
        marked[r][c] = false;
        return  false;

    }


}






































