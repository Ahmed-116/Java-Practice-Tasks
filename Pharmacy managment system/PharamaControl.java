public class PharamaControl {
    Pharmacuetical[] pharmacueticals=new Pharmacuetical[10];

public int medicineCounter=0;

    public void addToInventory(Pharmacuetical p){
        if(medicineCounter>=pharmacueticals.length){
            System.out.println("Inventory is full");
        }
       pharmacueticals[medicineCounter++]=p;
        System.out.println("Medicine added to Inventory");


    }
    public void removeFromInventory(String Medicine){

            for(int i=0;i<pharmacueticals.length-1;i++){
                if(pharmacueticals[i].medName.equals(Medicine)){

                }
                pharmacueticals[i]=pharmacueticals[i+1];

            }
        System.out.println("Medicine removed from Inventory");
            pharmacueticals[medicineCounter-1]=null;
            medicineCounter--;
    }
    public void searchInventory(String Medicine){
       for(int i=0;i<medicineCounter;i++){
           if(pharmacueticals[i]!=null&&pharmacueticals[i].medName.equals(Medicine){
               System.out.println("Medicine found");
               pharmacueticals[i].displaySpec();
           }

               System.out.println("Medicine not found");
           }

       }
    }
    public void issueMedicine(){

    }
    public void restockMedicine(){

    }
    public void generateReport(){

    }


}
