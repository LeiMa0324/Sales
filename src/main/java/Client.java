import lombok.Data;

import java.util.Comparator;

@Data
public abstract class Client implements Comparator {

    private Integer ClientID;
    private String ClientName;
    private Empoloyee employee;

    //constructor with only client id
    public Client(int id){
        ClientID = id;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public void setEmployee(Empoloyee employee) {
        this.employee = employee;
    }

    public int getClientID() {
        return ClientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public Empoloyee getEmployee() {
        return employee;
    }

    public int compareTo(Client o) {
        Client p = (Client) o;
        if (this.getClientID() < p.getClientID()) {
            return -1;
        } else if (this.getClientID() == p.getClientID()) {
            return 0;
        } else {
            return 1;
        }
    }

    public double totalSales(){
        // TODO: 2020-02-06 what's in it 
    }
}
