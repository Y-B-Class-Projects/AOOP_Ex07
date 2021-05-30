public class OnionRings extends HamburgerDecorator{

    public OnionRings(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return this.hamburger.serve() + " with onion rings";
    }
}
