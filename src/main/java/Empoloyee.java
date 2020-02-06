import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Comparator;

@Data

public abstract class Empoloyee {

    // one employee has a bunch of clients
    private ArrayList<Client> clients;

    //add a client in numeric order of clientID
    public boolean addClient(Client e) {

        boolean addSuccess;
        Client[] clientList = clients.to
        Collections.sort(clients);

    }



    //get the clients
    public ArrayList<Client> getClients(){
        return clients;
    }

}
