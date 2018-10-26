package users;

public class UserModel {

    public UserModel() {}

    public UserModel(String name, String lastName, int age) {
        super();
        this.setName(name);
        this.setLasName(lastName);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private String lasName;
    private int age;
}
