public class University {

    private String universityName;
    private Campus lahore;
    private Campus sahiwal;

    public void setUname(String u) {
        universityName = u;
    }

    public String getUname() {
        return universityName;


    }

    public void setLhr(Campus lhr) {
        lahore = lhr;
    }

    public Campus getLhr() {
        return lahore;

    }

    public void setswl(Campus swl) {
        sahiwal = swl;
    }

    public Campus getswl() {
        return sahiwal;

    }

    public void display() {
        System.out.println("University Name : " + universityName);


    }
}