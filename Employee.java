public class Employee {
  private int id;
  private String name;
  private double salary;

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public void toString() {
    System.out.println(id+" : "+" : "+name+" : "+salary);
  }


}
