class Encapsulation {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog();
        GoodDog dog2 = new GoodDog();
        dog1.setSize(70);
        dog2.setSize(10);
        dog1.bark();
        dog2.bark();
    }
}

class GoodDog {
    private int size;

    public void setSize(int s) {
        size = (s > 0) ? s : 0;
    }

    public int getSize() {
        return size;
    }

    public void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else {
            System.out.println("Yeep! Yeep!");
        }
    }
}

