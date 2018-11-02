package com.ax.offer._15_hasPath;

import java.awt.color.ColorSpace;

/**
 *  矩阵中的路径
 *
 *  题目描述
         请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
         路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
         如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
         例如下面的矩阵包含了一条 bfce 路径。


 解题思路】

 这是一个可以用回朔法解决的典型题。
 //1. 首先，在矩阵中任选一个格子作为路径的起点。如果路径上的第i个字符不是ch，那么这个格子不可能处在路径上的第i个位置。如果路径上的第i个字符正好是ch，那么往相邻的格子寻找路径上的第i+1个字符。除在矩阵边界上的格子之外，其他格子都有4个相邻的格子。重复这个过程直到路径上的所有字符都在矩阵中找到相应的位置。
 //2. 由于回朔法的递归特性，路径可以被开成一个栈。当在矩阵中定位了路径中前n个字符的位置之后，在与第n个字符对应的格子的周围都没有找到第n+1个字符，这个时候只要在路径上回到第n-1个字符，重新定位第n个字符。
 //3. 由于路径不能重复进入矩阵的格子，还需要定义和字符矩阵大小一样的布尔值矩阵，用来标识路径是否已经进入每个格子。 当矩阵中坐标为（row,col）的格子和路径字符串中相应的字符一样时，从4个相邻的格子(row,col-1),(row-1,col),(row,col+1)以及(row+1,col)中去定位路径字符串中下一个字符
 //4. 如果4个相邻的格子都没有匹配字符串中下一个的字符，表明当前路径字符串中字符在矩阵中的定位不正确，我们需要回到前一个，然后重新定位。
 //5. 一直重复这个过程，直到路径字符串上所有字符都在矩阵中找到合适的位置
 ---------------------
 作者：ouyangyanlan
 来源：CSDN
 原文：https://blog.csdn.net/ouyangyanlan/article/details/72874885
 版权声明：本文为博主原创文章，转载请附上博文链接！

 * 注意: 这题是真的看不懂
 * */
public class HasPath {

    public  boolean  hasPath(char[]  matrix,int rows ,int cols,char[] str)  {

        if(matrix == null || rows<=0 || cols<= 0|| str == null) {
            return  false;
        }

        if(str.length == 0){
            return  true;
        }
        boolean[] visited = new  boolean[matrix.length];
        for (int i = 0;i <rows;i++){
            for (int j= 0;j< cols;j++){
                if(findPath(matrix,i,j,rows,cols,0,visited,str)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findPath(char[] matrix, int row, int col, int rows, int cols, int k, boolean[] visited, char[] str) {
        if(row <0 || row >= rows || col<0||col >=cols|| str[k] != matrix[row*cols + col]|| visited[row*cols+col]){
            return false;
        }
        if(k == str.length -1 ){
            return  true;
        }
        visited[row*cols+col] = true;
        if(findPath(matrix, row+1, col, rows, cols, k+1, visited, str) || findPath(matrix, row, col+1, rows, cols, k+1, visited, str) || findPath(matrix, row-1, col, rows, cols, k+1, visited, str) || findPath(matrix, row, col-1, rows, cols, k+1, visited, str)) {
            return  true;
        }
        visited[row*cols+col] = false;
        return false;
    }

}


































































