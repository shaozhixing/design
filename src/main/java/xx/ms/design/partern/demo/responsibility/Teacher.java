package xx.ms.design.partern.demo.responsibility;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 20:05
 * @copyright: gofun
 */
public class Teacher extends Leader {
    @Override
    void handle(int count) {
        count += 1;
        System.out.println(count);
        if (nextLeader != null) {
            nextLeader.handle(count);
        } else {
            System.out.println("结束了");
        }
    }
}
