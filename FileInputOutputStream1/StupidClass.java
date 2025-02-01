public class StupidClass {


    public static void main(String[] args) {
        String name="Ahmed";
        String line="Hi name how are you";
        System.out.println(name.substring(2));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.lastIndexOf("m",1));

        String newname=name.replaceAll("Ahmed","Hero");
        System.out.println(newname);

        String newline=line.replaceAll("name","Ahmed");
        System.out.println(newline);
    }
}
