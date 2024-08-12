public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double increase){
        grossSalary += (grossSalary * increase) / 100;
    }

    @Override
    public String toString() {
        return name + " ," + "$ " + String.format("%.2f", netSalary());
    }
}
