package xx.ms.design.partern.demo.factory.factory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:37
 * @copyright: gofun
 */
public class ICourseToJava implements ICourse {
    @Override
    public void learn() {
        System.out.println("java");
    }
}
