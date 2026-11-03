public class AsteriskDecorator extends BaseDecorator implements TextDecorator {
    @Override
    public String decorate(String text) {
        return surround(text, "*** ", " ***");
    }
}
