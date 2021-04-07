

public class Main {

    public static void main(String[] args) {
        DBrun dbTemp = new DBrun("Hans","Gatan2","temp",false,50);

        dbTemp.connect(dbTemp.name,dbTemp.address,dbTemp.password);
        dbTemp.disconnect();
        System.out.println(dbTemp.getName(dbTemp.id));


    }
}
