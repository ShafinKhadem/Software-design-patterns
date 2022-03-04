
class Vanilla_Shake extends Shake {

    Vanilla_Shake() {
        name = "Vanilla Shake";
        price = 190;
        topping = false;
        lactoseFree = false;
    }

    void addBases() {
        if(lactoseFree) addComponent("Almond Milk");
        else addComponent("Milk");
        addComponent("Sugar");
        addComponent("Vanilla Flavoring");
        addComponent("Jello");
    }

}
