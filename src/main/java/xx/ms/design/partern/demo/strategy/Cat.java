package xx.ms.design.partern.demo.strategy;

import org.springframework.stereotype.Component;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 16:53
 * @copyright: gofun
 */
@Component
public class Cat extends IAnimalStrategy {
    @Override
    public void eat() {
        System.out.println("小鱼干");
    }

    @Override
    String name() {
        return "cat";
    }


}
