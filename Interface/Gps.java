public interface Gps extends Map{
    int a=5;


    void location();

    default void city(){
        System.out.println("City");
    }

    static void country(){
        System.out.println("Country");
    }
}
