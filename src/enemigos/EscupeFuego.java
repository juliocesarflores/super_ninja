package enemigos;

import java.util.ArrayList;

import superGoku.Animacion;
import superGoku.Criatura;


///herendando la clase 
public class EscupeFuego extends Enemigo{

	public EscupeFuego(ArrayList<Animacion> animaciones) {
		super(animaciones);
		// TODO Auto-generated constructor stub
		setIndiceAnimacion(0);
	}
	
	@Override
	public void verificarColision(Criatura criatura) throws Exception {
		// TODO Auto-generated method stub
		//super.verificarColision(criatura);
		if(this.hayColision(criatura)){
			criatura.morir();
		}		
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseIzquierda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detenerse() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
        
        ///generamos comportamiento de las criaturas

	@Override
	public void generarComportamiento() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
