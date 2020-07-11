package xx.ms.design.partern.demo.proxy.CGLibProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 16:16
 * @copyright: gofun
 */
public class CGLibProxyMain {

    public static void main(String[] args) {
        Animal animal = (Animal) new CGLibProxy().getInstanse(Cat.class);
        animal.eat("apple");
        animal.play();
    }

}
