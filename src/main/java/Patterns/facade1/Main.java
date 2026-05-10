package Patterns.facade1;

public class Main {
    public static void main(String[] args) {
        DoorClose doorClose = new DoorClose();
        DoorOpen doorOpen = new DoorOpen();
        DoorLock doorLock = new DoorLock();

        DoorFacade doorFacade = new DoorFacade(doorClose, doorLock, doorOpen);
        doorFacade.manageDoor();
    }
}
