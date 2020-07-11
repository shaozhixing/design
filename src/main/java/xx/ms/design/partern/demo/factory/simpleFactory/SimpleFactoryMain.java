package xx.ms.design.partern.demo.factory.simpleFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:29
 * @copyright: gofun
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new ICourseFactory();
        ICourse iCourse = iCourseFactory.create(ICourseToPython.class);
        iCourse.learn();
    }

}
