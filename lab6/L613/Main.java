package L613;

public class Main {
    public static void main(String[] strings) {
        OvservableStringBuilder undobleStringBuilder =
                new OvservableStringBuilder();
        undobleStringBuilder.setOnChangeListener(new MyListener());
        undobleStringBuilder.append("Hello");
        undobleStringBuilder.append(", ");
        undobleStringBuilder.append("World!");
    }
}
