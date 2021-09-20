
import java.util.Objects;

public class Contact {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public Contact(String name, String streetAddress, String city, String state, String zip, String phone) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }
    
    public Contact(Contact c) {
        this.name = c.name;
        this.streetAddress = c.streetAddress;
        this.city = c.city;
        this.state = c.state;
        this.zip = c.zip;
        this.phone = c.phone;
    }
    
    public Contact copy() {
        return new Contact(name, streetAddress, city, state, zip, phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.streetAddress);
        hash = 53 * hash + Objects.hashCode(this.city);
        hash = 53 * hash + Objects.hashCode(this.state);
        hash = 53 * hash + Objects.hashCode(this.zip);
        hash = 53 * hash + Objects.hashCode(this.phone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.streetAddress, other.streetAddress)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        String s = name + "\n";
        s += streetAddress + "\n";
        s += city + ", " + state + " " + zip + "\n";
        s += "P: " + phone;
        return s;
    }
    
    
}
