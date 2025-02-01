public class Generics2 <T extends Number>{
    private T Bound;
    private T Parameter;
    public Generics2(T Bound, T Parameter){
        this.Bound = Bound;
        this.Parameter = Parameter;
    }
    public T getBound(){
        return Bound;
    }
    public T getParameter(){
        return Parameter;

    }
    public void setBound(T Bound){
        this.Bound = Bound;
    }
    public void setParameter(T Parameter){
        this.Parameter = Parameter;
    }

    @Override
    public String toString() {
        return "Generics2{" +
                "Bound=" + Bound +
                ", Parameter=" + Parameter +
                '}';
    }
}
