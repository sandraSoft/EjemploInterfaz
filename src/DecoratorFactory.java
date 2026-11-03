public class DecoratorFactory {
    public static TextDecorator getDecorator(int option) {
        return switch (option) {
            case 1 -> new AsteriskDecorator();
            case 2 -> new ArrowDecorator();
            case 3 -> new HashDecorator();
            default -> null;
        };
    }
}
