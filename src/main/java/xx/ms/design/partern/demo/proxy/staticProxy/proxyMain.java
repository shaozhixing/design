package xx.ms.design.partern.demo.proxy.staticProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:42
 * @copyright: gofun
 */
public class proxyMain {

    public static void main(String[] args) {
        NationProxy nationProxy = new NationProxy(new JaPan());
        nationProxy.talk();
    }

}
