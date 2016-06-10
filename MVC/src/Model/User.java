package Model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="user")
public class User {
    private String name;
    private String Surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}
