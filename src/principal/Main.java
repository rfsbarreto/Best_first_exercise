package principal;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;

import busca.Cenario;

public class Main {
	
	public static void main(String args[]){
		Cenario c= new Cenario();
		int[][] matrizPontos= c.getMatriz();
		Point roboPosition = c.getRoboPosition();
		Point objetivoPos= c.getObjPos();
		busca_bestfit(roboPosition,objetivoPos);
	}

	private static ArrayList<Point> busca_bestfit(Point roboPosition,Point objetivoPos) {
		ArrayList<Point> open = null,closed=null;
		open.add(roboPosition);
		
		while (!open.isEmpty()){
			Point p= open.get(0);
			open.remove(0);
			if ( p==objetivoPos){
				closed.add(0, p);
				//closed.
				return  closed;
			}
		}
		
	}

}
