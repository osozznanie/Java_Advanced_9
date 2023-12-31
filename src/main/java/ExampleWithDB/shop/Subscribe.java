package ExampleWithDB.shop;

public class Subscribe {
    private int id;
    private int idUsers;
    private int idMagazine;
    private boolean statusSubscribe;

    public Subscribe(int id, int idUsers, int idMagazine, boolean statusSubscribe) {
        this.id = id;
        this.idUsers = idUsers;
        this.idMagazine = idMagazine;
        this.statusSubscribe = statusSubscribe;
    }

    public Subscribe(int idUsers, int idMagazine, boolean statusSubscribe) {
        this.idUsers = idUsers;
        this.idMagazine = idMagazine;
        this.statusSubscribe = statusSubscribe;
    }

    public int getId() {
        return id;
    }

    public Subscribe() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public int getIdMagazine() {
        return idMagazine;
    }

    public void setIdMagazine(int idMagazine) {
        this.idMagazine = idMagazine;
    }

    public boolean isStatusSubscribe() {
        return statusSubscribe;
    }

    public void setStatusSubscribe(boolean statusSubscribe) {
        this.statusSubscribe = statusSubscribe;
    }

    @Override
    public String toString() {
        return "Subscribes{" +
                "id=" + id +
                ", idUsers=" + idUsers +
                ", idMagazine=" + idMagazine +
                ", statusSubscribe=" + statusSubscribe +
                '}';
    }
}

