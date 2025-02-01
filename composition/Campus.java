public class Campus {

    private String campusName;
    private Department CS;
    private Department SE;

    public void setCname(String c) {
        this.campusName = c;
    }

    public String getCname() {
        return campusName;
    }

    public void setCS(Department cs1) {
        this.CS = cs1;
    }

    public Department getCS() {
        return CS;
    }

    public void setSE(Department se1) {
        this.SE = se1;
    }

    public Department getSE() {
        return SE;
    }

    public void display() {
        System.out.println("Campus Name: " + campusName);


    }
}