package xx.ms.design.partern.demo.obServer.obServer;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:23
 * @copyright: gofun
 */
public class MqUtil {

    public static void send (String msg){
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.addObserver(teacher);
        student.send(msg);
    }

}
