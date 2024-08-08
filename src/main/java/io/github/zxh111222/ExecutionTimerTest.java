package io.github.zxh111222;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/8 10:51
 */
public class ExecutionTimerTest {
    public static void main(String[] args) {
        long time = ExecutionTimer.calculate(new Algorithm() {
            @Override
            public void execute() {
                int sum = 0;
                for (int i = 0; i < 100000; i++) {
                    sum += i;
                }
            }
        });
        System.out.println(time + " ms");
    }
}
