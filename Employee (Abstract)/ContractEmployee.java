public class ContractEmployee extends Employee {

    public double fixedSalary=4000;

    @Override
    public double calSalary() {
        return fixedSalary;
    }
}