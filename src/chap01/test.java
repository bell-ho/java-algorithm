package chap01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //1. ready
        Callable<List<String>> task = new Callable<List<String>>() {
            @Override
            public List<String> call() throws Exception {
                ArrayList<String> arrList = new ArrayList<String>();
                int cnt = 0;
                while(cnt < 1) {
                    System.out.println("working");
                    Thread.sleep(100);
                    cnt++;
                }
                arrList.add("success");
                return arrList;
            }
        };

        //2. execute
        Future<List<String>> future = executorService.submit(task);

        try {
            List<String> result = future.get(3, TimeUnit.SECONDS);
            System.out.println(result.get(0) + "!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdownNow();
        }
    }

}
