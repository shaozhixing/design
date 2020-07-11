package xx.ms.design.partern.demo.obServer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:46
 * @copyright: gofun
 */
public class MessageUtil {

    public static void send (String msg) {
        EventBus eventBus = new EventBus();
        MsgConsumer msgConsumer = new MsgConsumer();
        eventBus.register(msgConsumer);
        eventBus.post(msg);
    }

}
