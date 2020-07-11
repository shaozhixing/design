package xx.ms.design.partern.demo.factory.simpleFactory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:05
 * @copyright: gofun
 */
public class ICourseFactory {

    public ICourse create (Class<?> clazz) {
        if (clazz != null) {
            ICourse iCourse = null;
            try {
                iCourse = (ICourse) clazz.newInstance();
            } catch (Exception e) {

            }
            return iCourse;
        }
        return null;
    }

}
