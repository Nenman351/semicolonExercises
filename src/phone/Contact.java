package phone;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private int id;

    public Contact(String firstName, String lastName, String phoneNumber, int id, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                ===================
                Contact %s
                firstName %s
                lastName %s
                phoneNumber %s
                emailAddress %s
                id %d
                =====================
                """, firstName,lastName,phoneNumber,emailAddress,id);
//        return "Contact{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                ", id=" + id +
//                '}';
    }

}
