package PreparationsForInterview.Static_Final_AM;

public class Main {
    public static void main(String[] args) {
        User kolya = new User("kolya");
        User.printUsers();
        User kolya1 = new User("kolya1");
        User.printUsers();
        Country q = new Country("q");
        CreateObject1 object = CreateObject1.createObject();
        System.out.println(object);
        System.out.println(Program.programVersion);

        ObjectsCreation obj1 = ObjectsCreation.create();
        Session ses1 = new Session();
        System.out.println(Session.getSessionsCount());
        Session ses2 = new Session();
        System.out.println(Session.getSessionsCount());
        ses1.close();
        System.out.println(Session.getSessionsCount());
        Token token1 = new Token("token1");
        System.out.println(token1.getToken());
        Parametrs.setTimeout(56);
        System.out.println(Parametrs.getTimeout());
        Parametrs.setTimeout(986);
        System.out.println(Parametrs.getTimeout());
        UserAccount one = new UserAccount("one", "one");
        one.name= "two";
        IdGenerator.createId();
        System.out.println(IdGenerator.createId());
        System.out.println(IdGenerator.createId());

        BD bd = new BD("5", "6", "6");
        ObjectCount ob1 = ObjectCount.createObjectCount();
        ObjectCount ob2 = ObjectCount.createObjectCount();
        ObjectCount ob3 = ObjectCount.createObjectCount();
        ObjectCount ob4 = ObjectCount.createObjectCount();
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println(ob4);
        Device dev1 = new Device("dev1");
        System.out.println(dev1.getDeviceName());
    }
}
