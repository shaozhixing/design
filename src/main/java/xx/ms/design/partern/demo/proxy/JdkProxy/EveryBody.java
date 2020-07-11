package xx.ms.design.partern.demo.proxy.JdkProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:50
 * @copyright: gofun
 */
public class EveryBody implements Person {
    @Override
    public void eat(String food) {
        System.out.println("eat:" + food);
    }

    @Override
    public void play() {
        System.out.println("play computer");
    }
}
