package xx.ms.design.partern.demo.proxy.staticProxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:40
 * @copyright: gofun
 */
public class NationProxy implements INation {

    private INation iNation;

    public NationProxy (INation iNation) {
        this.iNation = iNation;
    }

    @Override
    public void talk() {
        iNation.talk();
    }
}
