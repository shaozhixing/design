package xx.ms.design.partern.demo.obServer.obServer;

import java.util.Observable;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 19:09
 * @copyright: gofun
 */
public class Student extends Observable {

    private static Student student;

    static {
        student = new Student();
    }

    public Student getInstanse () {
        return student;
    }

    public void send (String message) {
        setChanged();
        notifyObservers(message);
    }

}
