import java.io.Serializable;

public class Data implements Serializable {
  //  private static final long serialVersionUID = 1L;

    public String name = "Ahmed";
    public int age = 2;

    @Override
    public String toString() {
        return "Data{name='" + name + "', age=" + age + "}";
    }
}
