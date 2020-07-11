package xx.ms.design.partern.demo.factory.abstractFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:59
 * @copyright: gofun
 */
public class SchoolFactory implements ISchoolFactory {
    @Override
    public ITeacher createTeacher() {
        return new Teacher();
    }

    @Override
    public IStudent createStudent() {
        return new Student();
    }
}
