

class ShakeFactory {
    static Shake getShake(String shakename, boolean lactoseFree, int topping) {

        Shake shake = null;

        if(shakename == null){
            System.out.println("Unrecognized Shake!!! Try again.");
            return null;
        }

        if (shakename.equalsIgnoreCase("Chocolate Shake")) {
            shake = new Chocolate_Shake();
        } else if(shakename.equalsIgnoreCase("Coffee Shake")) {
            shake = new Coffee_Shake();
        } else if(shakename.equalsIgnoreCase("Strawberry Shake")) {
            shake = new Strawberry_Shake();
        } else if(shakename.equalsIgnoreCase("Vanilla Shake")) {
            shake = new Vanilla_Shake();
        } else if(shakename.equalsIgnoreCase("Zero Shake")) {
            shake = new Zero_Shake();
        } else {
            System.out.println("Unrecognized Shake!!! Try again.");
            return null;
        }

        if (lactoseFree) shake.makeLactoseFree();

        shake.addBases();

        if(topping == 1) {
            shake.addTopping("Candy");
        } else if (topping == 2) {
            shake.addTopping("Cookie");
        }

        return shake;
    }
}

