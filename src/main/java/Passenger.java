public class Passenger {
    private int passportNumber;
    private String name;
    private String contactInformation;

    public Passenger(int passportNumber, String name, String contactInformation){
        this.passportNumber = passportNumber;
        this.name = name;
        this.contactInformation= contactInformation;

    }

    public int getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
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
}
