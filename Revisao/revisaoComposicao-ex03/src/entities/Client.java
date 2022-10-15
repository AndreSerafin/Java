package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private String name;
    private String email;
    private Date birhtDate;

    public Client() {

    }

    public Client(String name, String email, Date birhtDate) {
        this.name = name;
        this.email = email;
        this.birhtDate = birhtDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirhtDate() {
        return birhtDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Client: " + name
                + "(" + sdf.format(birhtDate) + ") - " + email;
    }
}
