package poc.com.br.poc.model;

/**
 * Created by Leandro on 02/01/2017.
 */

public class Contact  {

    private int id;
    private String name;
    private String email;

    public Contact (){

    }

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Contact(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

