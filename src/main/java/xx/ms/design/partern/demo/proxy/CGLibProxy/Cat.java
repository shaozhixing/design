package xx.ms.design.partern.demo.proxy.CGLibProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 16:14
 * @copyright: gofun
 */
public class Cat implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("eat:" + food);
    }

    @Override
    public void play() {
        System.out.println("play computer");
    }
}
