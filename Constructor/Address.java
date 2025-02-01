public class Address {

    private String city;
    private int stNo;

    Address(String c,int s){
        this.city = c;
        this.stNo = s;
    }

/* 
    public void setCity(String c){
        this.city = c;
    }

    public String getCity(){
        return city;
    }

    public void setStNo(int s){
        this.stNo = s;
    }

    public int getStNo(){
        return stNo;
    }
    */
    public void displayInfo(){
        System.out.println(city);
        System.out.println(stNo);
    }
}
