public class FriedEgg extends HamburgerDecorator{

    public FriedEgg(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return this.hamburger.serve() + " with fried egg";
    }
}
