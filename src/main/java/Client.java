import lombok.Data;

import java.util.Comparator;

@Data
public class Client implements Comparable<Client> {

    private Integer ClientID;
    private String ClientName;
    private Employee employee; // sales manager or sales associate

    /**
     * Constructoe
     * @param name client name
     * @param id   client id
     */
    public Client(String name, int id ){
        ClientID = id;
        ClientName = name;

    }

    public int getClientID() {
        return ClientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public void setEmployee(Employee employee) {
            this.employee = employee;
    }


    /**
     * compare the current client id with a given one
     * @param o a given client
     * @return  positve: this is greater, 0: equal, negative: smaller
     */
    @Override
    public int compareTo(Client o) {
        return this.getClientID() - o.getClientID();
    }

    public double totalSales(){
        return 0.0;
    }

    public String toString(){
        return "Client: " + this.ClientName + ". Sales Employee: "+this.employee.getEmployeeName() +" "+this.employee.getSaleID();
    }
}
