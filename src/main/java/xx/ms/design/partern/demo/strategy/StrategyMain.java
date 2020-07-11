package xx.ms.design.partern.demo.strategy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 17:14
 * @copyright: gofun
 */
public class StrategyMain {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
        IAnimalStrategy iAnimalStrategy = animalFactory.getStrategy("dog");
        iAnimalStrategy.eat();
        IAnimalStrategy iAnimalStrategy1 = animalFactory.getStrategy("cat");
        iAnimalStrategy1.eat();
    }

}
