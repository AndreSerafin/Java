package entities;

import entities.enums.WorkerLevel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department, ArrayList<HourContract> contracts) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<HourContract> contracts) {
        this.contracts = contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.removeIf(x -> x.equals(contract));
    }

    public Double income(Integer month, Integer year) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract c : contracts) {
            calendar.setTime(c.getDate());
            int cYear = calendar.get(Calendar.YEAR);
            int cMonth = 1 + calendar.get(Calendar.MONTH);
            if(year == cYear && month == cMonth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
