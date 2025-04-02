package ut4.dos;

public class Prisma implements Comparable<Prisma>{
    int baseTriangulo;
    int alturaPrisma;
    Float AreaTotal;

    public Prisma() {
    }

    /**
     * Constructor cocon los datos del prisma, areatotal es un Float para poder ponerlo en null, asi el usuario no tine que
     * meter un dato que no conoce
     * @param baseTriangulo estos se crean de manera aleatoria en el main
     * @param alturaPrisma
     * @param AreaTotal empieza en null
     */
    public Prisma(int baseTriangulo, int alturaPrisma,Float AreaTotal) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
        this.AreaTotal = AreaTotal;
    }

    public float getAreaTotal() {
        return AreaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        AreaTotal = areaTotal;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Calcula la base del triangulo, la raiz cuadrada y el calculo estan separados de return para mayor claridad, se puede cambiar si se desea
     * @param baseTriangulo la introduce el usuario o se genera aleatoriamente
     * @return devuelve el resultado ya calculado
     */
    public float alturaTriangulo (int baseTriangulo) {
        float resultado;
        double raizde3 =Math.sqrt(3);
        resultado = (float) (raizde3/2*baseTriangulo);
        return resultado ;
    }

    /**
     * Calcula la base del triangulo, todas las operaciones estan separadas por claridad, no voy a poner lo mismo en todas
     * @param baseTriangulo este dato siempre lo introduce el usuario o de manera aleatoria
     * @return y todos los metodos devuelven un int
     */
    public float areaBase (int baseTriangulo) {
        float AreaBase;
        float htriangulo=alturaTriangulo(baseTriangulo);
        AreaBase=(htriangulo*baseTriangulo)/2;
        return AreaBase;
    }

    /**
     * calculo del perimetro
     * @param baseTriangulo
     * @return
     */
    public float perimetro (int baseTriangulo) {
        float perimetro;
        perimetro=3*baseTriangulo;
        return perimetro;
    }

    /**
     * calculo del area lateral
     * @param baseTriangulo
     * @param alturaPrisma
     * @return
     */
    public float areaLateral (int baseTriangulo,int alturaPrisma) {
        float areaL;
        float perimetro=perimetro(baseTriangulo);
        areaL = perimetro*alturaPrisma;
        return areaL;
    }

    /**
     * calculo del area total que usa todo el resto de metodos
      * @param baseTriangulo
     * @param alturaPrisma
     * @return
     */
    public float areaTotal (int baseTriangulo, int alturaPrisma) {
    float Abase=areaBase(baseTriangulo);
    float Alateral=areaLateral(baseTriangulo,alturaPrisma);
    float Atotal;
        Atotal= 2*Abase+Alateral;
    return Atotal;
    }

    /**
     * to string clasico sin cambios
     * @return
     */
    @Override
    public String toString() {
        return "Prisma{" +
                "baseTriangulo=" + baseTriangulo +
                ", alturaPrisma=" + alturaPrisma +
                '}';
    }

    /**
     * este es un to string solo que añadi area total, asi puede elegir si lo muestro o no
     * @return
     */
    public String AString() {
        return "Prisma{" +
                "baseTriangulo=" + baseTriangulo +
                ", alturaPrisma=" + alturaPrisma +
                ", Area total="+AreaTotal+
                '}';
    }

    /**
     * es un compare to normal que devuelve en orden descendente, lo unico es el Float.compare que
     * es una funcion del metodo que hace que no tenga errores en los ultimos inidices de la lista
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Prisma o) {
        return Float.compare (o.getAreaTotal(),this.getAreaTotal());

    }



}
