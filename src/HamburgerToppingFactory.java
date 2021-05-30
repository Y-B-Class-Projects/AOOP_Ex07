public class HamburgerToppingFactory {

    public static Hamburger createTopping(Hamburger hamburger, String code){
        // confirm we receive legal input
        if (code == null || code.isEmpty())
            return null;

        // according to the choice, create instance
        switch (code){
            case "ch":
                return new Chips(hamburger);
            case "or":
                return new OnionRings(hamburger);
            case "sa":
                return new Salad(hamburger);
            case "fe":
                return new FriedEgg(hamburger);
            default:
                throw new RuntimeException("wrong Topping");
        }
    }
}




