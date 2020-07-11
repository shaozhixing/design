package xx.ms.design.partern.demo.obServer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:41
 * @copyright: gofun
 */
public class MsgConsumer {

    @Subscribe
    public void subscribe (String msg) {
        try {
            System.out.println(msg);
            Thread.sleep(1000L);
        } catch (Exception e) {

        }
    }

}
