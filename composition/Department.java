public class Department {
    private String name;
    private String hod;

    public void setName(String name1) {

        this.name = name1;


    }

    public String getName() {

        return name;
    }


    public void setHOD(String hod1) {

        this.hod = hod1;


    }


    public String getHOD() {
        return hod;
    }

    public void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("HOD Name: " + hod);
    }
}