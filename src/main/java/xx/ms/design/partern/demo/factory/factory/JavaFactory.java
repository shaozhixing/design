package xx.ms.design.partern.demo.factory.factory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:39
 * @copyright: gofun
 */
public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new ICourseToJava();
    }
}
