package Patterns.facade1;

public class DoorFacade {
    private DoorClose doorClose;
    private DoorOpen doorOpen;
    private DoorLock doorLock;

    public DoorFacade(DoorClose doorClose, DoorLock doorLock, DoorOpen doorOpen) {
        this.doorClose = doorClose;
        this.doorLock = doorLock;
        this.doorOpen = doorOpen;
    }

    public void manageDoor() {
        doorOpen.openDoor();
        doorLock.lockDoor();
        doorClose.closeDoor();
    }
}
