package com.springmvc.method;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author:guobingnan
 * @date: 2020/11/23 11:37
 */
public class CompareToTest {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,4},{1,2},{1,6},{2,6},{3,5},{3,3},{4,10},{4,8},{5,6}};
        //Arrays.sort(arr, ((o1, o2) -> o1[0] - o2[0]));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Arrays.sort(arr, ((o1, o2) -> o2[0] == o1[0] ? (o1[1] > o2[1] ? 1 : -1) : 1));
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
