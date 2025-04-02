package ut4.TRES;

public class Cono {
    /**
     * Primero declara los atributos
      */
        private Circulo base;
        private float altura;
        private String color;

    /**
     * Crea un constructor con todos los datos
     * @param cX
     * @param cY Estos dos son las medidas del circulo
     * @param r Este es el radio que se genera de manera aleatoria
     * @param h Esta es la altura
     * @param color Y el color lo asigan el usuario
     */
        public Cono (float cX, float cY, float r, float h, String color) { // constructor
            this.base = new Circulo(cX, cY, r);
            this.altura = h;
            this.color = color;
        }

    /**
     * Distitnos geters y setters
     * @return
     */
    public Circulo getBase() {
            return base;
        }
        public void setBase(Circulo base) {
            this.base = base;
        }
        public float getAltura() {
            return altura;
        }
        public void setAltura(float altura) {
            this.altura = altura;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

    /**
     * El metodo que imprime los datos del cono al final
     */
    public void imprimir () {
            base.imprimir();
            System.out.println(" h=" + altura + " c=" + color);
        }
    }

