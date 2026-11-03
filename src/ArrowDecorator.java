public class ArrowDecorator implements TextDecorator {
    @Override
    public String decorate(String text) {
        return "--> " + text;
    }
}
