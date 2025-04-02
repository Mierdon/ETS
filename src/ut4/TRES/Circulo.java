package ut4.TRES;

public class Circulo {
    /**
     * Aqui se declaran los atributos, esta la longitud, la altura y el radio, todos pasados desde el cono
     */
        private float x, y;
        private float radio;

    /**
     * constructor con los parametros antes mencionados
     * @param cX
     * @param cY ALTERADO
     * @param r
     */
        public Circulo(float cX, float cY, float r) { // constructor
            this.x = cX;
            this.y = cY;
            this.radio = r;
        }

    /**
     * los distintos getters y setters
     * @return
     */
        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float getRadio() {
            return radio;
        }

        public void setRadio(float radio) {
            this.radio = radio;
        }

    /**
     * Con este metodo calculo el area
     * @return Esto devuelve el area
     */
        public float area() {
            return (float) Math.PI * radio * radio;
        }

    /**
     * Imprime el resultado de los calculos del circulo
     */
        public void imprimir() {
            System.out.print(" x=" + x);
            System.out.print(" y=" + y);
            System.out.print(" r=" + radio);
            System.out.print(" A=" + area());
        }
    }
