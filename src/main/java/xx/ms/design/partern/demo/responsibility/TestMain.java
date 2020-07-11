package xx.ms.design.partern.demo.responsibility;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 20:09
 * @copyright: gofun
 */
public class TestMain {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Monitor monitor = new Monitor();
        Student student = new Student();
        teacher.setLeader(monitor);
        monitor.setLeader(student);
        teacher.handle(1);
    }

}
