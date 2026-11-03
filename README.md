# Java Interface Decorator Example

This project shows how to use interfaces in Java to decorate a text with different formats.

## Main idea

- `TextDecorator` is the interface.
- Several classes implement it.
- `AsteriskDecorator` inherits from `BaseDecorator` and also implements the interface, which demonstrates the difference between inheritance and implementation.

## Run

```bash
javac src/*.java -d out
java -cp out Main
```
