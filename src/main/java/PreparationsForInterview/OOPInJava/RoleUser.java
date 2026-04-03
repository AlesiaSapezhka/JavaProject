package PreparationsForInterview.OOPInJava;

public class RoleUser {
    private String name;
    private Role role;

    public RoleUser(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public boolean canDo(String action){
        return role.canPerform(action);
    }

    public void setRole(Role newRole) {
        this.role = newRole; // смена роли без изменения логики User
    }
}
