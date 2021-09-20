public class WageEmployee extends AbstractEmployee {

    private int hours;
    private double wage;
    
    public WageEmployee(String lastName, String firstName, int hours, double wage) {
        super(lastName, firstName);
        this.hours = hours;
        this.wage = wage;
    }
    
    public WageEmployee(String lastName, String firstName) {
        super(lastName, firstName);
    }

    @Override
    public int getHoursPerWeek() {
        return hours;
    }

    @Override
    public void setHoursPerWeek(int hours) {
        this.hours = hours;
    }
    
    public void setWage(double wage) {
        this.wage = wage;
    }

    //TODO
    @Override
    public double getWeeklyPay() {
        if (hours<40)
            return wage*hours;
        else if (hours>=40)
            return (wage*40) + 1.5*wage*(hours-40);
        else
            return 0;
    }

    //TODO
    @Override
    public double getAnnualPay() {
        return getWeeklyPay()*52;
    }
}
