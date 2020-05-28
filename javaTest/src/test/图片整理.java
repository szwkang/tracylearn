package test;

/*Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小
（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过C语言解决*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 图片整理 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            char[] chs = line.toCharArray();
            Arrays.sort(chs);
            System.out.println(chs);
        }
    }
}
