interface Performance {
    void action();
    void award();
}

class Actor implements Performance {
    @Override
    public void action() {
        System.out.println("The actor performs an amazing scene.");
    }

    @Override
    public void award() {
        System.out.println("The actor receives an award for best performance.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.action();
        actor.award();
    }
}
