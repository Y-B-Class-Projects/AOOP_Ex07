
public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        // confirm we receive legal input
        if (code == null || code.isEmpty())
            return null;

        // according to the choice, create instance
        switch (code){
            case "cl":
                return new ClassicHamburger();
            case "sp":
                return new SpicyHamburger();
            case "la":
                return new LambHamburger();
            case "hm":
                return new HomemadeHamburger();
            default:
                throw new RuntimeException("wrong Hamburger");
        }

    }
}

