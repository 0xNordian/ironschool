package org.ironschool;
import java.util.UUID;
public class Person {
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

    public void setPersonalId() {
        this.personalId = UUID.randomUUID().toString();
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
