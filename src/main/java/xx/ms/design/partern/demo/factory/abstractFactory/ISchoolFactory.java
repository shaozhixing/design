package xx.ms.design.partern.demo.factory.abstractFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:56
 * @copyright: gofun
 */
public interface ISchoolFactory {
    ITeacher createTeacher();
    IStudent createStudent();
}
