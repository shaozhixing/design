package xx.ms.design.partern.demo.factory.abstractFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:55
 * @copyright: gofun
 */
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("教书");
    }
}
