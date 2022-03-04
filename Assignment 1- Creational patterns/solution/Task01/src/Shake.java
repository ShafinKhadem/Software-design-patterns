import java.util.LinkedList;

abstract class Shake {
    private LinkedList<String> components;
    boolean lactoseFree, topping;
    int price;
    String name;

    Shake() {
        components = new LinkedList<String>();
    }

    LinkedList<String> getBases() {
        String last = null;
        if(topping) last = components.removeLast();
        LinkedList<String> temp = new LinkedList<>(components);
        if(topping) components.addLast(last);
        return temp;
    }

    String getTopping() {
        if(topping) return components.peekLast();
        return null;
    }

    void addBases() {
    }

    void addComponent(String component) {
        components.add(component);
    }

    void addTopping(String toppingComponent) {
        if(toppingComponent.equalsIgnoreCase("Candy")) {
            price+=50;
        } else if(toppingComponent.equalsIgnoreCase("Cookie")) {
            price+=40;
        } else return;
        topping = true;
        components.add(toppingComponent);
    }

    boolean hasTopping() {
        return topping;
    }

    void makeLactoseFree() {
        lactoseFree = true;
        price += 60;
    }

    boolean isLactoseFree() {
        return lactoseFree;
    }

    void printShake() {

        System.out.println("\n"+name+"\n");

        System.out.println("Ingredients:");

        for (int i=0; i<components.size(); i++)
        {
            System.out.println((i+1)+". "+components.get(i));
        }

        System.out.println("\nTotal Price = "+ price);

        if (lactoseFree || topping) System.out.println("Extra charges:");

        if(lactoseFree) {
            System.out.println("Tk 60 added charge for lactose free shake.");
        }

        if(topping) {
            if(getTopping().equalsIgnoreCase("Candy")) {
                System.out.println("Tk 50 added for Candy topping.");
            }
            else System.out.println("Tk 40 added for Cookie topping.");
        }

    }


}
