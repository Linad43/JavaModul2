package nestedlinner;

public class Car {
    String carBrand;
    double speed;
    int weight;

    public Car(String carBrand, double speed, int weight, String titleBrandWheel, double pressionCamera) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
        Engine engine = new Engine();
        engine.isRunning();

        Wheel wheel = new Wheel(titleBrandWheel, pressionCamera);
        wheel.info(wheel.camera);
    }

    private class Engine {
        void isRunning() {
            class Piston {
                void moving() {
                    System.out.println("Поршень двигается и сжимает топливо");
                }
            }
            class Сandle {
                void ignit() {
                    System.out.println("Свеча искрой поджигает сжатое топливо");
                }
            }

            Piston piston = new Piston();
            Сandle candle = new Сandle();

            piston.moving();
            candle.ignit();
        }
    }

    private class Wheel {
        String titreBrand;
        Camera camera;
        class Camera {
            private double pression;

            public Camera(double pression) {
                this.pression = pression;
            }
            public double getPression(){
                return pression;
            }
        }

        public Wheel(String titreBrand, double pression) {
            this.titreBrand = titreBrand;
            this.camera = new Camera(pression);
        }

        void info(Camera camera) {
            System.out.println("Колеса марки " + titreBrand + " с давлением в шинах " + camera.getPression() + " бар");
        }
    }

}
