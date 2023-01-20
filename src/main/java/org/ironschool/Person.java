package org.ironschool;
import java.util.UUID;
public abstract class Person {
    private String personalId;
    private String personalName;
    private String email;
    private String address;

    public Person(String personalName, String email, String address) {
        this.personalName = personalName;
        this.email = email;
        this.address = address;
        setPersonalId();
    }

    public String getPersonalId() {
        return personalId;
    }

    private void setPersonalId() {
        this.personalId = UUID.randomUUID().toString();
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        //String !empty !blank
        //standard format: Trim whitespace & First capital letter
        this.personalName = personalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //String !empty !blank
        //standard format: Trim whitespace & lower case
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        //String !empty !blank
        //standard format: Trim whitespace
        this.address = address;
    }
}
