package practice5.Museum;

public class Worker {

    Ecsponat ecsponat;
    public void setEcsponat(Ecsponat ecsponat){
        this.ecsponat = ecsponat;
    }
    public void showEcsponat(Ecsponat ecsponat){
        ecsponat.history();
        ecsponat.preserve();
    }
}
