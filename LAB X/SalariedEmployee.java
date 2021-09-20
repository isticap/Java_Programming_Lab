public class SalariedEmployee extends AbstractEmployee{
    
    private int hours;
    private double salary;
    
    public SalariedEmployee(String lastName, String firstName, int hours, double salary) {
        super(lastName, firstName);
        this.hours = hours;
        this.salary = salary;
    }
    
    public SalariedEmployee(String lastName, String firstName) {
        super(lastName, firstName);
    }

    
    //TODO
    @Override
    public int getHoursPerWeek() {
        return hours;
    }

    
    //TODO
    @Override
    public void setHoursPerWeek(int hours) {
        this.hours = hours;
    }

    @Override
    public double getWeeklyPay() {
        return salary/52;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO
    @Override
    public double getAnnualPay() {
        return salary;
    }
    
}
