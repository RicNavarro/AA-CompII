package batalhanaval;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.border.EmptyBorder;


public class BatalhaNaval extends JFrame
{ 
   private JButton table[][];

   public BatalhaNaval()
   {
       super("Batalha Naval"); //Nome da janela
       setSize(1280,720); //Resolucao
       setResizable(false); //Nao pode diminuir ou aumentar a tela
       setDefaultCloseOperation(EXIT_ON_CLOSE);//Para de rodar quando fecha a janela
       
       criarGrade(); //Cria o jogo
       setVisible(true); //Deixa a janela visivel
   } 
   private void criarGrade(){
       
       
       ImageIcon icone = new ImageIcon("C:/Users/CLIENTE/Desktop/batalhanaval/vector-wave-009.jpg"); //Icone dos butoes
       JPanel grade = new JPanel(); 
       grade.setBackground(Color.white);//Setando o pano de fundo com a cor branca
       grade.setLayout(new GridLayout(11,11));//Tamanho do Grid Layout (mod)
       grade.setPreferredSize(new Dimension(100,200)); 
             
       table = new JButton[10][10]; 
       
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
              table[i][j] = new JButton(icone);  
              table[i][j].setPreferredSize(new Dimension(500,328));
           }
       }
       
       grade.add(new Label("              "));
       grade.add(new Label("         A "));  
       grade.add(new Label("         B ")); 
       grade.add(new Label("         C ")); 
       grade.add(new Label("         D ")); 
       grade.add(new Label("         E ")); 
       grade.add(new Label("         F ")); 
       grade.add(new Label("         G ")); 
       grade.add(new Label("         H ")); 
       grade.add(new Label("         I ")); 
       grade.add(new Label("         J ")); 
       
 
       grade.add(new Label("                          1"));
    
       for(int i=0; i<10; i++)    
       {       
            grade.add(table[0][i]);      
       }
        
        grade.add(new Label("                          2"));
        for(int i=0; i<10; i++)    
        {    
           grade.add(table[1][i]);
        }
        
        grade.add(new Label("                          3"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[2][i]);
        }
        
        grade.add(new Label("                          4"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[3][i]);
        }
        
        grade.add(new Label("                          5"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[4][i]);
        }
        
        grade.add(new Label("                          6"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[5][i]);
        }
        
        grade.add(new Label("                          7"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[6][i]);
        }
        
        grade.add(new Label("                          8"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[7][i]);
        }
        
        grade.add(new Label("                          9"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[8][i]);
        }
        
        grade.add(new Label("                          10"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(table[9][i]);
        }
        
        this.getContentPane().add(grade, BorderLayout.CENTER);
        
        // Background
        ImageIcon bg = new ImageIcon("C:/Users/CLIENTE/Desktop/batalhanaval/bg.png");         
        JLabel animegirl = new JLabel(bg); 
        animegirl.setBackground(Color.white);
        

        
        
        this.getContentPane().add(animegirl, BorderLayout.WEST);    
   }
 
  
           
   
   /*public static void main(String[] args){
       
       BatalhaNaval b = new BatalhaNaval();  
   }
  */
}
