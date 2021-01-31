import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String anniversary;
    private String address;
    private String city;
    private String state;
    private String country;
    private long pinCode;
    private long contactNumber;
    private long telephoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String gender, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public void validate()
    {
        Pattern pattern = Pattern.compile("[a-z0-9.%_]+@[a-z]+\\.[a-z]{2,4}");
        Matcher matcher = pattern.matcher(getEmail());
       if(firstName==null||lastName==null||dateOfBirth==null||email==null||(telephoneNumber==0&&contactNumber==0))
       {
           throw new NullPointerException("please enter the following details");
       }
       else
       {
           System.out.println("details are confirmed");
       }
       if(matcher.matches())
       {
           System.out.println(email+"Is is correct syntax");
       }
       else
       {
           System.out.println("Re- enter the email id");
       }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(String anniversary) {
        this.anniversary = anniversary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
