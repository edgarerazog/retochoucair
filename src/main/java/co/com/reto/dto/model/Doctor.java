package co.com.reto.dto.model;

public class Doctor {
 private String name;
 private String lastname;
 private String telephone;
 //private String id;


    public Doctor(String name, String lastname, String telephone) {
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
