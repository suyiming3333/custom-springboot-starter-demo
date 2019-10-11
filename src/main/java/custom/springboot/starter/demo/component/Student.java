package custom.springboot.starter.demo.component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: Student
 * @Package custom.springboot.starter.demo.component
 * @Description: TODO
 * @date 2019/10/11 22:31
 */


public class Student {

    public Student(String loginName) {
        this.loginName = loginName;
        System.out.println("创建Student");

    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    private String loginName;
}
