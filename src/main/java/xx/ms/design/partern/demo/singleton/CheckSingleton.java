package xx.ms.design.partern.demo.singleton;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 10:18
 * @copyright: gofun
 */
public class CheckSingleton {

    private static CheckSingleton checkSingleton = null;

    private CheckSingleton () {

    }

    public static CheckSingleton getInstanse () {
        if (checkSingleton == null) {
            synchronized (CheckSingleton.class) {
                if (checkSingleton == null) {
                    checkSingleton = new CheckSingleton();
                }
            }
        }
        return checkSingleton;
    }

}
