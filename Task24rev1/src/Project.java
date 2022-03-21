public class Project {
    // Attributes for project
    int number;
    String clientname;
    String name;
    int erfNumber;
    String type;
    String address;
    int cost;
    int paidTodate;
    String deadLine;
    // Methods for class use
    public Project(int number,String clientname,String name,int erfNumber,String type,String address,int projectCost,int paidTodate,String deadLine){
        this.clientname = clientname;
        this.name = name;
        this.number = number;
        this.erfNumber = erfNumber;
        this.type = type;
        this.address = address;
        this.cost = projectCost;
        this.paidTodate = paidTodate;
        this.deadLine = deadLine;
    }

    public String getName() {

        return name;
    }

    public int  getNumber() {

        return number;
    }

    public int getErfNumber() {

        return erfNumber;
    }

    public String getType() {

        return type;
    }
    public String getAdress() {

        return address;
    }

    public int getCost() {

        return cost;
    }

    public String getClientname() {
        return clientname;
    }

    public int getPaidTodate() {
        return paidTodate;
    }
    public String getDeadLine() {
        return deadLine;
    }
    public String toString(){
        String output = " Project Number: " + number;
        output+= "\n Client name: " + clientname;
        output+= "\n Project Name: " + name;
        output+= "\n Project Erfnumber: " + erfNumber;
        output+= "\n Building Type: " + type;
        output+= "\n Physical Adress: " + address;
        output+= "\n Project Cost: " + cost;
        output+= "\n Amount Paid to date: " + paidTodate;
        output+= "\n Project deadline: " + deadLine;
        return output;
    }
}

