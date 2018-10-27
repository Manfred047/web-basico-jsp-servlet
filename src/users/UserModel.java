package users;

public class UserModel {

    public UserModel() {}

    public UserModel(String name, String lastName, int age) {
        super();
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private String lastName;
    private int age;
}
