package xx.ms.design.partern.demo.factory.abstractFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:55
 * @copyright: gofun
 */
public class Student implements IStudent {
    @Override
    public void learn() {
        System.out.println("学习");
    }
}
