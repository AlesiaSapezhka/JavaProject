package PreparationsForInterview.OOPInJava;

public class Moderator implements Role{
    @Override
    public boolean canPerform(String action) {
        return action.equals("delete") || action.equals("edit");
    }
}
