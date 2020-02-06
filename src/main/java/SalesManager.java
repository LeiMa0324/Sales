import java.util.ArrayList;

public class SalesManager extends Employee {

    protected ArrayList<Employee> employees;

    public SalesManager(String name, long id){
        super(name, id);
        employees = new ArrayList<Employee>();
    }

    @Override
    public double bonus(){
        return 5000*this.employees.size() + 2000*this.clients.size();
    }

    public void addEmployee(SalesAssociate e){
        employees.add(e);   //add e to the employee's list
    }

    public String toString(){
        StringBuilder str = new StringBuilder("Sales Manager:" + this.employeeName + ". Employees: ");
        if(employees!=null&&clients!=null){
            for(Employee e: employees){
                String devider=e!= employees.get(employees.size()-1)?", ":". ";
                str.append(e.employeeName).append(" ").append(e.saleID).append(devider);
            }
            str.append("Clients: ");
            for(Client c: clients){
                String devider=c!= clients.get(clients.size()-1)?", ":". ";
                str.append(c.getClientName()).append(" ").append(c.getClientID()).append(devider);
            }
            str.append("Bonus: ").append(this.bonus());
        }
        else {
            str = new StringBuilder("something is missing");
        }
        return str.toString();
    }
}
