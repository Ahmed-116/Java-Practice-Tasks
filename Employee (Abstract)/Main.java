public class Main {
    public static void main(String[] args) {
        Employee employee[]=new Employee[100];
        employee[0]=new RegularEmployee();
        //System.out.println(employee[0].calSalary());
        employee[1]=new ContractEmployee();
       // System.out.println(employee[1].calSalary());
        employee[2]=new ComissionEmployee();
       // System.out.println(employee[2].calSalary());
        employee[3]=new HourlyEmployee();
        //System.out.println(employee[3].calSalary());
         displaySalaries(employee);
        raiseSalary(employee);
        System.out.println("Salary updated");
        displaySalaries(employee);

        }

    public static void displaySalaries(Employee employee[]){
         for(Employee e:employee){
             if(e!=null)
             System.out.println(e.calSalary());
         }
    }
  public static void raiseSalary(Employee employee[]){
        for(Employee e:employee){
            if(e!=null){
                if(e instanceof HourlyEmployee){
                    double temp=((HourlyEmployee) e).getHourlyRate();
                    ((HourlyEmployee) e).setHourlyRate(temp+temp*0.1);


                }
            }
        }
  }
    }

