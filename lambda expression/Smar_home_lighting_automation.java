interface LightPattern {
    void activate();
}
class LightDemo {
    public static void main(String[] args) {

        LightPattern motion = () -> System.out.println("Light ON due to motion");
        LightPattern evening = () -> System.out.println("Soft yellow light for evening");
        LightPattern voice = () -> System.out.println("Voice command: Lights ON");

        motion.activate();
        evening.activate();
        voice.activate();
    }
}

