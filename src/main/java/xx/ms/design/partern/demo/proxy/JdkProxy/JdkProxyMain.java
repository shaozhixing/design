package xx.ms.design.partern.demo.proxy.JdkProxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:51
 * @copyright: gofun
 */
public class JdkProxyMain {

    public static void main(String[] args) throws Exception {
        Person person = (Person) new NationProxy().getInstance(new EveryBody());
        person.eat("apple");
        person.play();

        byte[] bt = ProxyGenerator.generateProxyClass("proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("D://proxy0.class");
        fileOutputStream.write(bt);
        fileOutputStream.close();
    }

}
