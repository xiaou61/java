package 常用API.a7;

import java.util.StringJoiner;

//cloneable
//如果当前接口没有一个抽象方法，就是一个标记性接口。就表示，一旦实现了，当前对象
//就可以被克隆，如果不能实现，就无法实现
public class User implements Cloneable {
    private int id;
    private String name;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String name, String password, String path, int[] data) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        int [] data=this.data;

        int [] newData=new int[data.length];

        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        //调用父类
        User u =(User) super.clone();

        //因为父类是克隆方法是浅克隆，替代克隆出来对象的数组地址值
        u.data=newData;
        return u;
    }
    public String arrTosttring(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }
    public String toString() {
        return "User{id = " + id + ", name = " + name + ", password = " + password + ", path = " + path + ", data = " + arrTosttring()+ "}";
    }
}
