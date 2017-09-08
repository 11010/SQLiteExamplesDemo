package bodor.com.sqliteexamplesdemo;

import java.net.PortUnreachableException;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class Person {
    private int Id;
    private String Name,Email;

    public Person(){

    }
    public Person(int id, String name, String email) {
        this.Id = id;
        this.Name = name;
        this.Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
