package xx.ms.design.partern.demo.factory.simpleFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:25
 * @copyright: gofun
 */
public class ICourseToPython implements ICourse {
    @Override
    public void learn() {
        System.out.println("python");
    }
}
