package PreparationsForInterview.OOPInJava;

public class Admin implements Role{
    @Override
    public boolean canPerform(String action) {
        return true;
    }
}
