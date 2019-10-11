package custom.springboot.starter.demo.component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: Teacher
 * @Package custom.springboot.starter.demo.component
 * @Description: TODO
 * @date 2019/10/11 22:32
 */
public class Teacher {

    public Teacher() {
        System.out.println("创建teache");
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private String teacherName;

}
