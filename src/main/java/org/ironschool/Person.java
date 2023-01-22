package org.ironschool;
import java.util.Arrays;
import java.util.UUID;
public abstract class Person {
    private String personalId;
    private String personalName;
    private String email;
    private String address;

    public Person(String personalName, String email, String address) {
        setPersonalName(personalName);
        setEmail(email);
        setAddress(address);
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

    public void setPersonalName(String personalName) throws IllegalArgumentException {
        if(personalName.isBlank()){
            throw new IllegalArgumentException("Illegal Argument: 'Name' cannot be empty nor contain only whitespaces.");
        }
        String[] nameArray = personalName.trim().split(" ");
        for(int i = 0; i < nameArray.length; i++){
            nameArray[i] = nameArray[i].substring(0,1).toUpperCase() + nameArray[i].substring(1).toLowerCase();
        }
        this.personalName = Arrays.toString(nameArray).replace("[", "").replace("]", "").replace(",", "");
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
