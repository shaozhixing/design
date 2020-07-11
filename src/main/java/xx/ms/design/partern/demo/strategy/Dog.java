package xx.ms.design.partern.demo.strategy;

import org.springframework.stereotype.Component;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 16:54
 * @copyright: gofun
 */
@Component
public class Dog extends IAnimalStrategy {

    @Override
    public void eat() {
        System.out.println("狗不理");
    }

    @Override
    String name() {
        return "dog";
    }
}
