public class Personas {
    //1.definir atributos
    protected String Nombre;
    protected String Apellido;
    protected byte Edad;
    protected float Peso;
    protected float Altura;

    //2.metodos constructores
    public Personas (String Nombre, String Apellido, byte Edad, float Peso, float Altura){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad= Edad;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    public Personas(){

    }
        public void setNombre(String Nombre){
            this.Nombre=Nombre;
        }
        public String getNombre(){
            return this.Nombre;
        }
        public void setApellido(String Apellido){
            this.Apellido=Apellido;
        }
        public String getApellido(){
            return Apellido;
        }
        public void setEdad(byte Edad) {
            this.Edad = Edad;
        }        
        public byte getEdad() {
            return Edad;
        }
        public void setPeso(float Peso) {
            this.Peso = Peso;
        }        
        public Float getPeso() {
            return Peso;
        }
        public void setAltura(float Altura){
            this.Altura = Altura;
        }
        public float getAltura(){
            return Altura;
        }
        @Override
        public String toString(){
            return "Nombre: " + this.Nombre + ", Apellido: " + this.Apellido + ", Edad: " + this.Edad + ", Peso: " + this.Peso + ", Altura: " + this.Altura;
        }
    }
