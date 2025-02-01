public class ComissionEmployee extends ContractEmployee {

    private double comissionRate=30;
    double totalSales=0.1;

    @Override
    public double calSalary() {
        return super.calSalary()+comissionRate * totalSales;
    }
}
