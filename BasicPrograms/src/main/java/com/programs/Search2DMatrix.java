package com.programs;


public class Search2DMatrix {

    static boolean findInRow(int[][] arr, int target, int row) {
        int start = 0, end = arr[0].length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[row][mid] == target)
                return true;
            else if (target > arr[row][mid])
                start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, col = matrix[0].length;
        int startRow = 0, endRow = rows - 1;

        while (startRow <= endRow) {
            int midRow = (startRow + (endRow - startRow) / 2);
            if (target >= matrix[midRow][0] && target <= matrix[midRow][col - 1])
                return findInRow(matrix, target, midRow);
            else if (target > matrix[midRow][col - 1])
                startRow = midRow + 1;
            else endRow = midRow - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
