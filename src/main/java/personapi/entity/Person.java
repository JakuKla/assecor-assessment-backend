package personapi.entity;

public class Person {

    private int id;

    private String firstname;

    private String lastname;

    private String codeAndCity;

    private int colorCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCodeAndCity() {
        return codeAndCity;
    }

    public void setCodeAndCity(String codeAndCity) {
        this.codeAndCity = codeAndCity;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }
}