package xx.ms.design.partern.demo.obServer.obServer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:11
 * @copyright: gofun
 */
public class Teacher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        try {
            Student student = (Student) o;
            System.out.println("收到了：" + arg);
            Thread.sleep(1000L);
        } catch (Exception e) {

        }

    }
}
