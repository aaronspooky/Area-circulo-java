package circulo;

public class DemoCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo miCirculo = new Circulo(); //nombreClase nombreObjeto = new nombreClase();
		System.out.println("El del circulo de radio " +
				miCirculo.radio + " es " + miCirculo.calcularArea() );
	}
	

}

class Circulo{
	double radio = 5.0;
	double calcularArea(){ //metodo calcularArea();
	return radio*radio*3.1416;
	}
}