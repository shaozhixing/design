package xx.ms.design.partern.demo.obServer.guava;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:45
 * @copyright: gofun
 */
public class MsgMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MessageUtil.send("你好啊1");
        }
    }

}
