// House class (Product)
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private String exterior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public void display() {
        System.out.println("Xây dựng xong nhà với các đặc điểm sau:");
        System.out.println("Nền móng: " + this.foundation);
        System.out.println("Kết cấu: " + this.structure);
        System.out.println("Mái: " + this.roof);
        System.out.println("Nội thất: " + this.interior);
        System.out.println("Ngoại thất: " + this.exterior);
    }
}

// HouseBuilder class (Builder)
class HouseBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder buildFoundation(String foundation) {
        this.house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildStructure(String structure) {
        this.house.setStructure(structure);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        this.house.setRoof(roof);
        return this;
    }

    public HouseBuilder buildInterior(String interior) {
        this.house.setInterior(interior);
        return this;
    }

    public HouseBuilder buildExterior(String exterior) {
        this.house.setExterior(exterior);
        return this;
    }

    public House getHouse() {
        return this.house;
    }
}

// Usage
public class BuilerExample {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();

        House myHouse = houseBuilder
            .buildFoundation("Nền móng chắc chắn")
            .buildStructure("Kết cấu bê tông cốt thép")
            .buildRoof("Mái ngói đỏ")
            .buildInterior("Nội thất hiện đại")
            .buildExterior("Ngoại thất màu xanh lá cây")
            .getHouse();

        myHouse.display();
    }
}
