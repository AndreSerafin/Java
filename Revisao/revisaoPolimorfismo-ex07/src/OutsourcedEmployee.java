public class OutsourcedEmployee extends Employee {

    private Double addtionalCharge;

    public OutsourcedEmployee() {

    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

}
