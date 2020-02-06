import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data

public abstract class Employee {

    protected String employeeName;  //employee name
    protected ArrayList<Client> clients;    //client list
    protected long saleID;      //sales id

    /**
     * Constructor
     * @param name  employee name
     * @param id    employee id
     */
    public Employee(String name, long id){
        employeeName = name;
        saleID = id;
        clients = new ArrayList<Client>();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public long getSaleID() {
        return saleID;
    }

    public ArrayList<Client> getClients(){
        return clients;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSaleID(long saleID) {
        this.saleID = saleID;
    }

    /**
     * check if a client is already in the client list, if not, add him/her into the client list
     * @param e a given client
     * @return  boolean If the client is added successfully
     */
    public boolean addClient(Client e) {
        boolean success;
        if(clients.contains(e)){            // check if e is in here
            success = false;
        }
        else {
            clients.add(e);         //add the client to the list of this employee
            e.setEmployee(this);        // set the employee of this client
            Client[] clientlist = new Client[clients.size()];
            clientlist = clients.toArray(clientlist);
            Arrays.sort(clientlist);
            clients.clear();
            Collections.addAll(clients, clientlist);
            success = true;
        }
        return success;

    }

    abstract double bonus();
}
