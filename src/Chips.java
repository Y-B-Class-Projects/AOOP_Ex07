public class Chips extends HamburgerDecorator {

    public Chips(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return this.hamburger.serve() + " with Chips";
    }
}
