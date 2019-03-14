public class Person {
    private String name;
    private String surname;
    private String phone;

    public Person() {
        this.name = "";
        this.surname = "";
        this.phone = "";
    }

    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean checkPhone(){
        return phone.matches("([0-9]){9}");
    }

    public String toString(){
        return name + ", " + surname +"(" + phone +")";
    }
}

