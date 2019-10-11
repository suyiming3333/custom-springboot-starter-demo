package custom.springboot.starter.demo.component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: School
 * @Package custom.springboot.starter.demo.component
 * @Description: TODO
 * @date 2019/10/11 22:35
 */
public class School {
    public School() {
        System.out.println("创建School");

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private String schoolName;

}
