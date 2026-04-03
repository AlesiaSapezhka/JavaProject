package practice5.Museum;

public class Main {
    public static void main(String[] args) {

       Exponat sculpture = new Sculpture();
       Exponat manuscript = new Manuscript();
       Worker museumWorker = new Worker();

       museumWorker.showEcsponat(sculpture);
       museumWorker.showEcsponat(manuscript);

    }
}
