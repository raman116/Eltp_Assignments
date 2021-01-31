
public class Medicine {
    int type;
    private String name;
   private String companyAddress;

    public Medicine(int type) {
        this.type = type;
    }

    public void displayLabel()
    {
        System.out.println(getType()+ " type having name " + getName() + "and address of this is " + getCompanyAddress());
        System.out.println("Medicines Information");
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
