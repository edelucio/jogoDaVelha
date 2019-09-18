package jogoDaVelha;

import java.util.Scanner;

public class Computador extends Jogador{
	public Scanner entrada = new Scanner(System.in);
    
    public Computador(int jogador){
        super(jogador);
        this.jogador = jogador;
        System.out.println("Jogador 'Computador' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
    	Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);        
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        do{
            int num;
			do{
            	num = 1+(int)(Math.random()*3);
                System.out.printf("\n A linha escolhida foi:%d \n",(num));
                tentativa[0] = num ;
                
                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                
            }while( tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
            	num = 1+(int)(Math.random()*3);
                System.out.printf("\n A coluna escolhida foi:%d \n",(num));
                tentativa[1] = num;
                
                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while( !checaTentativa(tentativa, tabuleiro) );
    }
}
