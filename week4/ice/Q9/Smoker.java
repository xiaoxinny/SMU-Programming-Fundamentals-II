public class Smoker implements  Human, Flammable {
    @Override
    public void smoke() {
        Human.super.smoke(); // note: we need to prefix it with the interface name
        Flammable.super.smoke();
    }
}
