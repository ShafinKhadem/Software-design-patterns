class Chocolate_Shake extends Shake {

    Chocolate_Shake() {
        name = "Chocolate Shake";
        price = 230;
        topping = false;
        lactoseFree = false;
    }

    void addBases() {
        if(lactoseFree) addComponent("Almond Milk");
        else addComponent("Milk");
        addComponent("Sugar");
        addComponent("Chocolate Syrup");
        addComponent("Chocolate Ice Cream");
    }
}
