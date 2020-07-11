package xx.ms.design.partern.demo.factory.simpleFactory;


/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:24
 * @copyright: gofun
 */
public class ICourseToJava implements ICourse {
    @Override
    public void learn() {
        System.out.println("java");
    }
}
