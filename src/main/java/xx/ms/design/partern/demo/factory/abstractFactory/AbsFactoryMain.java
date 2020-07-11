package xx.ms.design.partern.demo.factory.abstractFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 10:00
 * @copyright: gofun
 */
public class AbsFactoryMain {
    public static void main(String[] args) {
        ISchoolFactory iSchoolFactory = new SchoolFactory();
        iSchoolFactory.createStudent().learn();
        iSchoolFactory.createTeacher().teach();
    }
}
