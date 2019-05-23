package base.enums;

public enum Color {
    RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("黑色", 3),
    YELLOW("黄色", 4);

    String value;
    int index;

    Color(String value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Color{" +
                "value='" + value + '\'' +
                ", index=" + index +
                '}';
    }
}