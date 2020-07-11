package xx.ms.design.partern.demo.factory.factory;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 9:40
 * @copyright: gofun
 */
public class FactoryMain {

    public static void main(String[] args) {
        ICourseFactory java = new JavaFactory();
        java.create().learn();
        ICourseFactory python = new PythonFactory();
        python.create().learn();
    }

}
