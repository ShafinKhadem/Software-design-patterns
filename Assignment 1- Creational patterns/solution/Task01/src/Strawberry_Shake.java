
class Strawberry_Shake extends Shake {

    Strawberry_Shake() {
        name = "Strawberry Shake";
        price = 200;
        topping = false;
        lactoseFree = false;
    }

    void addBases() {
        if(lactoseFree) addComponent("Almond Milk");
        else addComponent("Milk");
        addComponent("Sugar");
        addComponent("Strawberry Syrup");
        addComponent("Strawberry Ice Cream");
    }

}
