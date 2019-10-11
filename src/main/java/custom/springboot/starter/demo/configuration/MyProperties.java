package custom.springboot.starter.demo.configuration;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MyProperties
 * @Package custom.springboot.starter.demo.configuration
 * @Description: TODO
 * @date 2019/10/11 22:26
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 用于实现读取application.yml中的配置
 */
@ConfigurationProperties(prefix = MyProperties.PREFIX)
public class MyProperties {

    public static final String PREFIX = "my";

    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
