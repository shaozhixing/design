package xx.ms.design.partern.demo.responsibility;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 20:03
 * @copyright: gofun
 */
public abstract class Leader {

    public Leader nextLeader;

    abstract void handle(int count);

    public void setLeader (Leader leader) {
        this.nextLeader = leader;
    }

}
