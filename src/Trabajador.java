public class Trabajador {

    public String m_nombre;// nombre
    public int m_edad;// edad
    public int m_categoria;// categoria
    public int m_antiguedad;// antiguedad
    public double m_sueldo;// sueldo

    Trabajador() {
        m_nombre = "Ines";
        m_edad = 31;
        m_categoria = 2;
        m_antiguedad = 1;
        m_sueldo = 900;
    }

    Trabajador(String s_nombre, int s_edad, int s_categoria, int s_antiguedad, int s_sueldo) {
        setNombre(s_nombre);
        setEdad(s_edad);
        setCategoria(s_categoria);
        setAntiguedad(s_antiguedad);
        setSueldo(s_sueldo);
    }

    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nCategoria: "
                + getCategoria() + "\nAntigüedad: " + getAntiguedad() + "\nSueldo: "
                + getSueldo();
    }

    private void setNombre(String s_nombre) {
        this.m_nombre = s_nombre;
    }

    private String getNombre() {
        return this.m_nombre;
    }

    private void setEdad(int s_edad) {
        this.m_edad = s_edad;
    }

    private int getEdad() {
        return this.m_edad;
    }

    private void setCategoria(int s_categoria) {
        this.m_categoria = s_categoria;
    }

    private int getCategoria() {
        return this.m_categoria;
    }

    private void setAntiguedad(int s_antiguedad) {
        this.m_antiguedad = s_antiguedad;
    }

    private int getAntiguedad() {
        return this.m_antiguedad;
    }

    private void setSueldo(double s_sueldo) {
        this.m_sueldo = s_sueldo;
    }

    private double getSueldo() {
        return this.m_sueldo;
    }

    private void calcularAntiguedad(Trabajador s_trabajador, double s_incremento) {
        switch (s_trabajador.m_antiguedad) {
            case 0:
                s_trabajador.m_sueldo = (((s_trabajador.m_sueldo + s_trabajador.m_sueldo) * s_incremento) + 150);
                break;
            case 1:
                s_trabajador.m_sueldo = (((s_trabajador.m_sueldo + s_trabajador.m_sueldo) * s_incremento) + 300);
                break;
            case 2:
                s_trabajador.m_sueldo = (((s_trabajador.m_sueldo + s_trabajador.m_sueldo) * s_incremento) + 600);
                break;
        }
    }

    private void calcularSueldo() {
        switch (this.m_categoria) {
            case 0:
                calcularAntiguedad(this, 0.15);
                break;
            case 1:
                calcularAntiguedad(this, 0.35);
                break;
            case 2:
                calcularAntiguedad(this, 0.6);
                break;
            default:
            this.m_sueldo = (((this.m_sueldo + this.m_sueldo) * 0.6) + 600);
                break;
        }
    }

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Pepe", 29, 1, 2, 830);

        t1.calcularSueldo();

        System.out.println(t1.toString());

    }
}
