public class RegularEmployee extends Employee {
    public double baseSalary;
    public double houseRent=0.1;

    @Override
    public double calSalary() {
        return baseSalary + baseSalary * houseRent;
    }
}
