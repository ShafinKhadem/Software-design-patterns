class Zero_Shake extends Shake {

    Zero_Shake() {
        name = "Zero Shake";
        price = 240;
        topping = false;
        lactoseFree = false;
    }

    void addBases() {
        if(lactoseFree) addComponent("Almond Milk");
        else addComponent("Milk");
        addComponent("Sweetener");
        addComponent("Vanilla Flavoring");
        addComponent("Sugar-Free Jello");
    }

}
