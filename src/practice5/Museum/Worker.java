package practice5.Museum;

public class Worker {

    Exponat exponat;
    public void setEcsponat(Exponat exponat){
        this.exponat = exponat;
    }
    public void showEcsponat(Exponat exponat){
        exponat.history();
        exponat.preserve();
    }
}
