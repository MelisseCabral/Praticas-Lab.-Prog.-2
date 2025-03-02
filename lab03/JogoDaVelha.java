/* Aluna: Melisse Pontes Cabral*/

package lp2.lab03;

import java.util.Scanner;

public class JogoDaVelha {
	private static  char tabuleiro[][] = new char[3][3];
	private static final char O='O';
	private static final char X='X';
    private static int jogada=0,j,i;
    private static Scanner sc = new Scanner(System.in);
	
    public static void main(String args[]){

	    criaTabuleiro();

	    while(jogada<=9) {
	        System.out.print("  JOGO DA VELHA \n");
	        for(i=0;i<3;i++) {
	        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
	            if(i<3-1) {
	            	System.out.print("\n------\n");
	            }
	        }

	        System.out.println("\nINSIRA AS COORDENADAS");
	        if((jogada%2)==1)
	        	System.out.print("PLAYER 2\nLINHA: ");
	        else 
	        	System.out.print("PLAYER 1\nLINHA: ");

	        i = sc.nextInt();
	        System.out.print("COLUNA: ");
	        j = sc.nextInt();

	        if(tabuleiro[i-1][j-1]==' '){
	            if((jogada%2)==1)tabuleiro[i-1][j-1]=X;
	            else tabuleiro[i-1][j-1]=O;
	            jogada++;
	        }


	        if((tabuleiro[0][0]==O && tabuleiro[0][1]==O && tabuleiro[0][2]==O)||
	           (tabuleiro[1][0]==O && tabuleiro[1][1]==O && tabuleiro[1][2]==O)||
	           (tabuleiro[2][0]==O && tabuleiro[2][1]==O && tabuleiro[2][2]==O)||
	           (tabuleiro[0][0]==O && tabuleiro[1][0]==O && tabuleiro[2][0]==O)||
	           (tabuleiro[0][1]==O && tabuleiro[1][1]==O && tabuleiro[2][1]==O)||
	           (tabuleiro[0][2]==O && tabuleiro[1][2]==O && tabuleiro[2][2]==O)||
	           (tabuleiro[0][0]==O && tabuleiro[1][1]==O && tabuleiro[2][2]==O)||
	           (tabuleiro[0][2]==O && tabuleiro[1][1]==O && tabuleiro[2][0]==O)){
	        	for(i=0;i<3;i++){
		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
		            if(i<3-1){
		            	System.out.print("\n------\n");
		            }
		        }
	        	System.out.print("\nJogador 1, VOCE VENCEU!!!");
	            break;
	        }
	        if((tabuleiro[0][0]==X && tabuleiro[0][1]==X && tabuleiro[0][2]==X)||
	           (tabuleiro[1][0]==X && tabuleiro[1][1]==X && tabuleiro[1][2]==X)||
	           (tabuleiro[2][0]==X && tabuleiro[2][1]==X && tabuleiro[2][2]==X)||
	           (tabuleiro[0][0]==X && tabuleiro[1][0]==X && tabuleiro[2][0]==X)||
	           (tabuleiro[0][1]==X && tabuleiro[1][1]==X && tabuleiro[2][1]==X)||
	           (tabuleiro[0][2]==X && tabuleiro[1][2]==X && tabuleiro[2][2]==X)||
	           (tabuleiro[0][0]==X && tabuleiro[1][1]==X && tabuleiro[2][2]==X)||
	           (tabuleiro[0][2]==X && tabuleiro[1][1]==X && tabuleiro[2][0]==X)) {
	        	for(i=0;i<3;i++){
		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
		            if(i<3-1)
		            	System.out.print("\n------\n");
	        	}
	        	System.out.print("\nJogador 2, VOCE VENCEU!!!");
	            break;
	        }

	        if(jogada==9){
	        	for(i=0;i<3;i++){
		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
		            if(i<3-1) 
		            	System.out.print("\n------\n");
		        }
	        	System.out.print("\nPARTIDA EMPATADA");
	            break;
	        }
	    }
	    sc.close(); //fecha o objeto Scanner
	}

	private static void criaTabuleiro() {
		for(i=0;i<3;i++)
	        for(j=0;j<3;j++)
	            tabuleiro[i][j]=' ';
	}
}