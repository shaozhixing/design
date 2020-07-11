package xx.ms.design.partern.demo.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 10:21
 * @copyright: gofun
 */
public class SingletonMain {

    public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(8);

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            EXECUTOR_SERVICE.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(CheckSingleton.getInstanse());
                    System.out.println(StaticSingleton.getInstanse());
                }
            });
        }
        EXECUTOR_SERVICE.shutdown();
    }
}
