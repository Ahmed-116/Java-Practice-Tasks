public class HourlyEmployee extends Employee {
    int hours=30;
    double hourlyRate=30;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calSalary() {
        double totalSalary = 0;

        if(hours>40){
            totalSalary = hours*hourlyRate;
        }
        else {
           // int temp=40-hours;
            totalSalary = (40-hours)*hourlyRate*2+hours*40;
        }
        return totalSalary;
    }
}
