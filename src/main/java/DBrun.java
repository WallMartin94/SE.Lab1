public class DBrun implements DBInterface {

    String name;
    String address;
    String password;
    boolean connected;
    int id;


    public DBrun(String name, String address, String password, boolean connected, int id) {
        this.name = name;
        this.address = address;
        this.password = password;
        this.id = id;
        this.connected = connected;


    }



    public boolean connect(String name, String address, String password) {


        if (address == "Gatan2" && name == "Hans" && password == "temp") {

            System.out.println("Connecting...");
            return connected = true;
        } else System.out.println("Incorrect data, cannot connect");
        return connected = false;
    }


    public void disconnect() {
        System.out.println("Disconnecting...");
        connected = false;


    }


    public boolean isConnected() {

        if (connected = true) {

            System.out.println("You are connected");
            return connected;
        }
        else System.out.println("You are not connected");
        return connected;
    }


    public String getName(int id) {



        return name;

    }


}


