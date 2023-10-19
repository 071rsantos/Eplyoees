package entities;

public class Emplyoee {
    private Integer id;
    private String name;
    private Double salary;

    public Emplyoee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumentPerc(double p){
        double perc = getSalary() * (p/100);
        this.setSalary(getSalary()+perc);
    }

    @Override
    public String toString() {
        return getId() + ", "
            + getName() + ", "
            + "R$ " + String.format("%.2f", getSalary());
    }
}
