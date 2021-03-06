package test;

/*
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 统计每个月兔子的总数 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int monthCount = Integer.parseInt(line);
            System.out.println(getTotalCount(monthCount));
        }
    }

    public static int getTotalCount(int monthCount) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 2; i < monthCount; ++i) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
