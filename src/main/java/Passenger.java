public class Passenger {
    private int passportNumber;
    private String name;
    private String contactInformation;
    private String reference;

    public Passenger(int passportNumber, String name, String contactInformation){
        this.passportNumber = passportNumber;
        this.name = name;
        this.contactInformation= contactInformation;
        this.reference = "";
    }

    public int getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(int idNumber) {
        this.passportNumber = idNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

