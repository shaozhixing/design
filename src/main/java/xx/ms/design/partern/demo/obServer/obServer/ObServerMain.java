package xx.ms.design.partern.demo.obServer.obServer;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:09
 * @copyright: gofun
 */
public class ObServerMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MqUtil.send(i + "");
        }
    }

}
