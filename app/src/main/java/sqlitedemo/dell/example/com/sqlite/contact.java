package sqlitedemo.dell.example.com.sqlite;

/**
 * Created by DELL on 11/11/2017.
 */

public class contact {
    String name;
    int phone;

    public contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
