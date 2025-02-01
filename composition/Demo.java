public class Demo{

   public static void main(String[] args){


       University cui = new University();
       cui.setUname("Comsats University ");

       // Lahore Campus
       // Computer Science 
       cui.setLhr(new Campus());
       cui.getLhr().setCname("Lahore Campus  ");
       cui.getLhr().setCS(new Department());
       cui.getLhr().getCS().setHOD("Hammas ");
       cui.getLhr().getCS().setName("Sir Shahid Bhatti ");

       // Software Engineering

       cui.getLhr().setSE(new Department());
       cui.getLhr().getSE().setName("Tunda");
       cui.getLhr().getSE().setHOD("Wajahat");
            //Sahiwal campus
            //Computer science
       cui.setswl(new Campus());
       cui.getswl().setCname("Sahiwal campus");
       cui.getswl().setCS(new Department());
       cui.getswl().getCS().setHOD("Sami");
       cui.getswl().getCS().setName("Ahmed");

          //Software Engineering

       cui.getswl().setSE(new Department());
       cui.getswl().getSE().setHOD("Snake");
       cui.getswl().getSE().setName("Tunda snake");
       // Display Information
            System.out.println("University details:");
            System.out.println("____________________");
            System.out.println();
       cui.display();
       System.out.println();
       System.out.println("Lahore Campus and Department details:");
       System.out.println("______________________________________");
       System.out.println();
       cui.getLhr().display();
       System.out.println("CS Department:");
       System.out.println("_______________");
       cui.getLhr().getCS().displayInfo();
       System.out.println("SE Department:");
       System.out.println("________________");
       cui.getLhr().getSE().displayInfo();
       
       System.out.println();
       System.out.println("Sahiwal Campus and Department details:");
       System.out.println("______________________________________");
       System.out.println();
       cui.getswl().display();
       System.out.println("CS Department:");
       System.out.println("_______________");
       cui.getswl().getCS().displayInfo();
       System.out.println("SE Department:");
       System.out.println("_______________");
       cui.getLhr().getSE().displayInfo();
       
}
}


