package jp.ac.uryukyu.ie.e205701;

/**
 * アイテムクラス。 int shop_price; //ショップでの販売価格 int disposal_price; //売却価格 String
 * description; //アイテムの説明 String; //アイテム名
 */
public abstract class Item {
    private int shop_price;
    private int disposal_price;
    private String description;
    private String name;

    abstract void use(LivingThing target);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShop_price() {
        return shop_price;
    }

    public void setShop_price(int shop_price) {
        this.shop_price = shop_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisposal_price() {
        return disposal_price;
    }

    public void setDisposal_price(int disposal_price) {
        this.disposal_price = disposal_price;
    }

    public Item(int shop_price, int disposal_price, String description, String name) {
        this.shop_price = shop_price;
        this.disposal_price = disposal_price;
        this.description = description;
        this.name = name;
    }

}
