import acm.program.*;
import acm.graphics.*;

public class Ejercicio1 extends acm.program.GraphicsProgram{

	public void run(){
		//cambio el tama�o de la ventana
		setSize(800, 600);
		//llamo al metodo que dibuja la piramide
		pintaPiramide();
	}
	public void pintaPiramide(){
		int numLadrilloBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		
		int altoPiramide = numLadrilloBase * altoLadrillo;
		int basePiramide = numLadrilloBase * anchoLadrillo;
		
		
		//
		
		for(int j=0; j< numLadrilloBase; j ++){
			for(int i=j; i< numLadrilloBase; i++){
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				add(ladrillo,
						getWidth()/2 - basePiramide/2 + anchoLadrillo*j/-2 + anchoLadrillo * i,
						+ getHeight() - altoLadrillo - altoLadrillo*j);

			}
		}
	}
}