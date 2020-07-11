package xx.ms.design.partern.demo.factory.factory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:38
 * @copyright: gofun
 */
public class ICourseToPython implements ICourse {
    @Override
    public void learn() {
        System.out.println("python");
    }
}
