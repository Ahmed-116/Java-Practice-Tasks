class Artist{

    private String artistName;



// copy constructor
   Artist (Artist ab){
       this.artistName = ab.getArtistName();

   }


   Artist(String artistName){
        this.artistName = artistName;

   }

   Artist(){
      artistName = "Unknown";
   }


    public void setArtistName(String artistName){
      
       this.artistName = artistName;

    }

    public String getArtistName(){
      
       return artistName;

    }



 /* 

      public void displayArtist(){

           System.out.println("Artist Name: "+artistName);

 
     }

*/


}



class ArtWork{

      private String title;
      private int year;

      private Artist artist;



      public ArtWork shallowCopy(ArtWork sh){

             ArtWork art1 = new ArtWork(sh.getTitle(), sh.getYear(), sh.getArtist());

             return art1;

      }

      public ArtWork deepCopy(ArtWork dp){

            ArtWork art2 = new ArtWork(dp.getTitle(), dp.getYear(), new Artist(dp.getArtist().getArtistName()));

            return art2;
      }


/* 

      // copy construtor


       ArtWork(ArtWork aw){

             this.title = aw.getTitle();
             this.year = aw.getYear();

      //     this.artist = aw.getArtist();  // for shallow copy

             this.artist = new Artist(aw.getArtist());   // deep copy
   }


*/





   ArtWork(String title, int year){

     this.title = title;
     this.year = year;

     this.artist = new Artist("Unknown Artist");


   }


   ArtWork(String title, int year, Artist artist){

        this.title = title;
        this.year = year;
        this.artist = artist;


   }

   public void setTitle(String title){

         this.title = title;

   }

   public void setYear(int year){

         this.year = year;

   }

   public void setArtist(Artist artist){

         this.artist = artist;

   }

   public String getTitle(){

         return title;

   }

   public int getYear(){

         return year;

   }

   public Artist getArtist(){

         return artist;

   }

   public void displayArtWork(){
     
      System.out.println("Title: "+title);
      System.out.println("Year: "+year);
      System.out.println("Artist Name: "+artist.getArtistName());

   }



}



 public class Main{

    public static void main(String[]args){


       //Artist a1 = new Artist();

       ArtWork w1 = new ArtWork("Title Of Work", 2010 , new Artist("Josh Philips"));

       ArtWork w2 = new ArtWork("Title Of Work", 2010);

      System.out.println("");
      System.out.println("With Unknown Artist");
      System.out.println("");
      w2.displayArtWork();

      System.out.println("");
      System.out.println("For Shallow Copy (Before Modification)");
      System.out.println("");

      System.out.println("Original :- \n");
      w1.displayArtWork();




     ArtWork w3 = w1.shallowCopy(w1);
     System.out.println("\nShallow Copy:- \n");
     w3.displayArtWork();

     



     System.out.println("");
     System.out.println("After Modification ");
     System.out.println("");



       w1.getArtist().setArtistName("Alex Carey");

       System.out.println("Original :- \n");
       w1.displayArtWork();

       System.out.println("\nShallow Copy:- \n");
       w3.displayArtWork();

    



      System.out.println("");
      System.out.println("For Deep Copy (Before Modification)");
      System.out.println("");



       System.out.println("Original :- \n");
       w1.displayArtWork();


       System.out.println("\nDeep Copy\n");

       ArtWork w4 = w1.deepCopy(w1);
  
       w4.displayArtWork();




       System.out.println("");
       System.out.println("After Modification");
       System.out.println("");

       w1.getArtist().setArtistName("Jason Gillispe");


       System.out.println("\nOriginal:- \n"); 
       w1.displayArtWork(); 

       System.out.println("\nDeep Copy\n");
       w4.displayArtWork();



    }


}