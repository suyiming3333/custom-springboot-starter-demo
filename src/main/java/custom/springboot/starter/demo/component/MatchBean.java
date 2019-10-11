package custom.springboot.starter.demo.component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MatchBean
 * @Package custom.springboot.starter.demo.component
 * @Description: TODO
 * @date 2019/10/11 23:45
 */
public class MatchBean implements BeanInterface {
    public MatchBean() {
        System.out.println("i m MatchBean");
    }

    @Override
    public void description() {
        System.out.println("i m MatchBean");
    }
}
