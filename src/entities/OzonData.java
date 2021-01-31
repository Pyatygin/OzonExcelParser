package entities;

public class OzonData {
    private final String articul;
    private final String name;
    private final String sellPrice;
    private final String price;
    private final String pricePremium;

    public OzonData(String articul, String name, String sellPrice, String price, String pricePremium) {
        this.articul = articul;
        this.name = name;
        this.sellPrice = sellPrice;
        this.price = price;
        this.pricePremium = pricePremium;
    }

    public String getName() {
        return name;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public String getPrice() {
        return price;
    }

    public String getPricePremium() {
        return pricePremium;
    }

    public String getArticul() {
        return articul;
    }

    @Override
    public String toString() {
        return "OzonData{" +
                "name='" + name + '\'' +
                ", sellPrice=" + sellPrice +
                ", price=" + price +
                ", pricePremium=" + pricePremium +
                '}';
    }
}
