package GuitarSHop;

public class Guitar {
    private String serialNumber;
    private double price;
    private Builder builder;
    private String model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder, String model,
                  GuitarType type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber(){
        return serialNumber;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public Builder getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public GuitarType getType(){
        return type;
    }
    public Wood getBackwood(){
        return backWood;
    }
    public Wood getTopwood(){
        return topWood;
    }
}
