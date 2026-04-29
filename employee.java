
public class employee {

    private int id;
    private String name;
    private String email;

    public employee(String e, String n, int id) {
        this.name = n;
        this.id = id;
        this.email = e;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

}
