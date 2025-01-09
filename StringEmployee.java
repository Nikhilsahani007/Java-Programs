public class StringEmployee {
    int empId;
    String empName;
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public String toString(){
        return this.empName+","+this.empId;
    }
    public static void main(String[] args) {
        StringEmployee emp = new StringEmployee();
        emp.setEmpName("Nikhil Sahani");
        emp.empId = 594;
        System.out.println(emp);
    }
}
