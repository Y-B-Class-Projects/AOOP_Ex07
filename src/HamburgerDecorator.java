import java.util.List;

// in Decorator Pattern we have inheritance and
// composition relations to the interface
abstract class HamburgerDecorator implements Hamburger {
   // the hamburger instance is a "Has - a" relation.
    Hamburger hamburger;

    public HamburgerDecorator(Hamburger h) {
        this.hamburger = h;
    }
}
