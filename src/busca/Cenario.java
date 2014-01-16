package busca;

import java.awt.Point;

public class Cenario {
	private int[][] ambiente={
			{0,1,0,0,0,0,0},
			{0,0,0,0,1,0,0},
			{2,1,0,0,0,0,0},
			{0,0,0,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,0,0,1,1,0,3}};
	
	public Cenario(int[][] m){
		ambiente=m;
	}
	
	public Cenario(){
	
	}
	
	public int[][] getMatriz(){
		return ambiente;
	}
	
	public Point getRoboPosition(){
		for(int i=0;i<6;i++)
			for (int j=0;j<7;j++){
				if (ambiente[i][j]==2)
					return new Point(i, j);
			}
		return null;
	}

	public Point getObjPos() {
		// TODO Auto-generated method stub
		return null;
	}
}
