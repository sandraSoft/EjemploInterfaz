public class HashDecorator implements TextDecorator {
    @Override
    public String decorate(String text) {
        return "### " + text;
    }
}
