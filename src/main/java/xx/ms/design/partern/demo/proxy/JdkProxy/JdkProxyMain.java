package xx.ms.design.partern.demo.proxy.JdkProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:51
 * @copyright: gofun
 */
public class JdkProxyMain {

    public static void main(String[] args) {
        Person person = (Person) new NationProxy().getInstance(new EveryBody());
        person.eat("apple");
        person.play();
    }

}
