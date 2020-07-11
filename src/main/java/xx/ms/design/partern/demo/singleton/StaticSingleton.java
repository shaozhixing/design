package xx.ms.design.partern.demo.singleton;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 10:20
 * @copyright: gofun
 */
public class StaticSingleton {

    private static StaticSingleton staticSingleton = null;

    static {
        staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getInstanse () {
        return staticSingleton;
    }

}
