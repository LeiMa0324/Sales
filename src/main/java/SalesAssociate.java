/**
 * @author Lei Ma
 */
public class SalesAssociate extends Employee {

    protected SalesManager manager;

    public SalesAssociate(String name, long id){
        super(name, id);
    }
    public SalesManager getManager() {
        return manager;
    }

    public void setManager(SalesManager manager) {
        this.manager = manager; // set the manager of this
    }

    @Override
    /**
     * bonus for associates
     */
    public double bonus(){
        return 1000*this.clients.size();
    }

    public String toString(){
        StringBuilder str = new StringBuilder("Sales Associate:" + this.employeeName + ". Sales Manager: ");
        if(manager!=null&&clients!=null){
            str.append(manager.employeeName).append(" ").append(manager.saleID).append(". ");
            str.append("Clients: ");
            for(Client c: clients){
                String devider ="";
                devider=c!= clients.get(clients.size()-1)?", ":". ";
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
