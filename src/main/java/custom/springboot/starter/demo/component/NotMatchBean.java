package custom.springboot.starter.demo.component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MatchBean
 * @Package custom.springboot.starter.demo.component
 * @Description: TODO
 * @date 2019/10/11 23:45
 */
public class NotMatchBean implements BeanInterface {
    public NotMatchBean() {
        System.out.println("i m NotMatchBean");

    }

    @Override
    public void description() {
        System.out.println("i m NotMatchBean");
    }
}
