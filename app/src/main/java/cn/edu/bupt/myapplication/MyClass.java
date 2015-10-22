package cn.edu.bupt.myapplication;

/**
 * Created by Jabari on 2015/10/17.
 */
public class MyClass {

    /**
     * name : 王五
     * gender : man
     * age : 15
     * height : 140cm
     */

    private String name;
    private String gender;
    private int age;
    private String height;

    public MyClass(String name, String gender, int age, String height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setheight(String height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getheight() {
        return height;
    }
}
