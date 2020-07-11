package xx.ms.design.partern.demo.strategy;

import java.util.HashMap;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 17:06
 * @copyright: gofun
 */
public class AnimalFactory{

    public static final HashMap<String, IAnimalStrategy> map = new HashMap<>();


    static {
        map.put(new Cat().name(), new Cat());
        map.put(new Dog().name(), new Dog());
    }

    public IAnimalStrategy getStrategy (String key) {
        return map.get(key);
    }

}
