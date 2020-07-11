package xx.ms.design.partern.demo.factory.factory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:40
 * @copyright: gofun
 */
public class PythonFactory  implements ICourseFactory {
    @Override
    public ICourse create() {
        return new ICourseToPython();
    }
}
