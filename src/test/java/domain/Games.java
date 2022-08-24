package domain;

public class Games {
    private String name;
    private int price;
    private boolean available;
    private double version;
    private String[] functions;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getVersion() {
        return version;
    }

    public String[] getFunctions() {
        return functions;
    }
}
