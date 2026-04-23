package clean_code;

class Penguin extends Bird implements Flyable {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}