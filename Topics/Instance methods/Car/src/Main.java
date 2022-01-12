class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed = speed + 5;
    }

    void brake() {
        speed = speed - 5;

        if (speed < 0) {
            speed = 0;
        }
    }
}