package Phone;

public class BusinessContact extends Contact{
    String companyName;
    String companyAdress;
    int companyPhone;

    public BusinessContact(String name, String firstName, String adress, int phone, String companyName, String companyAdress, int companyPhone) {
        super(name, firstName, adress, phone);
        this.companyName = companyName;
        this.companyAdress = companyAdress;
        this.companyPhone = companyPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public int getCompanyPhone() {
        return companyPhone;
    }


}
