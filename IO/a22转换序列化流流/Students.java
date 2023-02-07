package IO.a22转换序列化流流;

import java.io.Serial;
import java.io.Serializable;

public class Students implements Serializable {

    @Serial
    private static final long serialVersionUID = 4284950972172432088L;
    private String name;
    private int age;
    private String address;


    public Students() {
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Students{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
