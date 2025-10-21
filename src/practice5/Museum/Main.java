package practice5.Museum;

import practice5.Restarant.Manager;

public class Main {
    static void main(String[] args) {

       Ecsponat sculpture = new Sculpture();
       Ecsponat manuscript = new Manuscript();
       Worker museumWorker = new Worker();

       museumWorker.showEcsponat(sculpture);
       museumWorker.showEcsponat(manuscript);

    }
}
