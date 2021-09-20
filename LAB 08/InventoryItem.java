
/**
 *
 * @author sjw
 */
public class InventoryItem {
    private long id;
    private String name;
    private String description;
    private double price;
    private int quantity;

    public InventoryItem(long id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + quantity;
        hash = 17 * hash + name.hashCode();
        hash = 17 * hash + description.hashCode();
        hash = 17 * hash + (int)(id ^(id >>> 32));
        hash = 17 * hash + (int)(Double.doubleToLongBits(price)^ 
                Double.doubleToLongBits(price) >>> 32);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        //are they the same object?
        if (this == obj) {
            return true;
        }
        
        //is the object null?
        if (obj == null) {
            return false;
        }
        
        //TODO: ADD YOUR CODE HERE!
        if (obj instanceof InventoryItem) {
            InventoryItem i = (InventoryItem) obj;
            return (this.id == i.id && this.name == i.name && this.description
                    == i.description && this.price == i.price && this.quantity
                    == i.quantity);
        }
        return false;
    }
}
