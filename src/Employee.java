import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

 public abstract class Employee implements Payable {
  public String employeeId;
  public String name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double getAverageMonthlySalary();

  @Override
  public String toString() {
    return name + " " + employeeId + " " + String.format("%.2f", this.getAverageMonthlySalary());
  }

  public void calculatePay() { }
}
