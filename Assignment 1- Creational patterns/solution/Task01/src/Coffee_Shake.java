class Coffee_Shake extends Shake {

    Coffee_Shake() {
        name = "Coffee Shake";
        price = 230;
        topping = false;
        lactoseFree = false;
    }

    void addBases() {
        if(lactoseFree) addComponent("Almond Milk");
        else addComponent("Milk");
        addComponent("Sugar");
        addComponent("Coffee");
        addComponent("Jello");
    }

}
