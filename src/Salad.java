public class Salad extends HamburgerDecorator{

    public Salad(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return this.hamburger.serve() + " with salad";
    }
}
