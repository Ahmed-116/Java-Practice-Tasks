public class Artist{
   private String name;
            Artist(String n){
      this.name=n;

}
       public void setArtistname(String name1){
               this.name=name1;
}
         public String getArtistname(){
              return name;
} 
  public void display(){
 System.out.println("Artist Name :"+name);
}
}