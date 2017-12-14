package batalhanaval;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.border.EmptyBorder;


public class BatalhaNaval extends JFrame implements ActionListener
{ 
   private JButton table[][];
   private boolean tablejafoiclicado[][];
   private int tablequalunidade[][];
   private JButton teste[][];
   private boolean testejafoiclicado[][];
   private int testequalunidade[][];

   public BatalhaNaval()
   {
       super("Batalha Naval"); //Nome da janela
       setSize(1100,1000); //Resolucao
       setResizable(false); //Nao pode diminuir ou aumentar a tela
       setDefaultCloseOperation(EXIT_ON_CLOSE);//Para de rodar quando fecha a janela
       
       criarGrade(); //Cria o jogo
       setVisible(true); //Deixa a janela visivel
   } 
   private void criarGrade(){
       
       
       ImageIcon icone = new ImageIcon("C:/Users/ricol/downloads/batounevaru/batalhanaval/vector-wave-009.jpg"); //Icone dos butoes
       JPanel grade = new JPanel(); 
       grade.setBackground(Color.white);//Setando o pano de fundo com a cor branca
       grade.setLayout(new GridLayout(22,12));//Tamanho do Grid Layout (mod)
       grade.setPreferredSize(new Dimension(100,23)); //faz merda nenhuma
             
       table = new JButton[10][10]; //Matriz do jogador
       teste = new JButton[10][10]; //Matriz do PC
       tablejafoiclicado = new boolean[10][10];//Matriz que verifica se um espaço do grid do jogador ja foi clicado
       testejafoiclicado = new boolean[10][10];//Matriz que verifica se um espaço do grid do PC ja foi clicado
       tablequalunidade = new int[10][10];//Matriz que indica qual unidade está em qual espaço do jogador
       testequalunidade = new int[10][10];//Matriz que indica qual unidade está em qual espaço do PC
       
       for(int i = 0; i < 10; i++) //Preenche matriz de botoes
       {
           for(int j = 0; j < 10; j++)
           {        
              table[i][j] = new JButton(icone);  
              table[i][j].setSize(new Dimension(328,328));
              table[i][j].addActionListener(this);
              tablejafoiclicado[i][j] = false;
           }
       }
       
       for(int i = 0; i < 10; i++)//Preenche matriz de botoes
       {
           for(int j = 0; j < 10; j++)
           {
            teste[i][j] = new JButton(icone);
            teste[i][j].setPreferredSize(new Dimension(328,328));
            testejafoiclicado[i][j] = false;
           }
       }
       
       //Coordenadas
       grade.add(new Label("              "));
       grade.add(new Label("       A "));  
       grade.add(new Label("       B ")); 
       grade.add(new Label("       C ")); 
       grade.add(new Label("       D ")); 
       grade.add(new Label("       E ")); 
       grade.add(new Label("       F ")); 
       grade.add(new Label("       G ")); 
       grade.add(new Label("       H ")); 
       grade.add(new Label("       I ")); 
       grade.add(new Label("       J ")); 
       
       
       //Matriz do jogador
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
      
        
        
        //Matriz inimiga 
        
        grade.add(new Label("              "));
        grade.add(new Label("       A "));  
        grade.add(new Label("       B ")); 
        grade.add(new Label("       C ")); 
        grade.add(new Label("       D ")); 
        grade.add(new Label("       E ")); 
        grade.add(new Label("       F ")); 
        grade.add(new Label("       G ")); 
        grade.add(new Label("       H ")); 
        grade.add(new Label("       I ")); 
        grade.add(new Label("       J ")); 
        
        grade.add(new Label("                          11"));
        for(int i=0; i<10; i++)    
        {    
            grade.add(teste[0][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[1][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[2][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[3][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[4][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[5][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[6][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[7][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[8][i]);
        }
        
        grade.add(new Label("                          11"));
        for(int i = 0; i < 10; i++)
        {
            grade.add(teste[9][i]);
        }

        this.getContentPane().add(grade, BorderLayout.CENTER);
        
        // Background
        ImageIcon bg = new ImageIcon("C:/Users/ricol/downloads/batounevaru/batalhanaval/bg.png");         
        JLabel animegirl = new JLabel(bg); 
        animegirl.setBackground(Color.white);
        
        this.getContentPane().add(animegirl, BorderLayout.WEST);  
        
        //Bottom
        //ImageIcon sub = new ImageIcon("C:/Users/ricol/downloads/batounevaru/batalhanaval/submarino.png");
        
        JButton botao = new JButton("sub"); 
        botao.setBackground(Color.white);
        JButton botao2 = new JButton("Aviao");
        botao2.setBackground(Color.white);
        JButton botao3 = new JButton("Porta-aviao");
        botao3.setBackground(Color.white);
        JButton botao4 = new JButton("Navia de escolta");
        botao4.setBackground(Color.white);
        
        
        JPanel navios = new JPanel();
        navios.setLayout(new GridLayout(1,1));
        navios.add(botao);
        navios.add(botao2);
        navios.add(botao3);
        navios.add(botao4);
        
        
   
        this.getContentPane().add(navios, BorderLayout.SOUTH);
   }
   
   public void actionPerformed(ActionEvent e){
	   Object object = e.getSource();
	   
	   for(int i = 0; i<10 ; i++)
		   for(int j = 0; j<10 ; j++)
			   if (object == table[i][j]){
				table[i][j].setIcon(new ImageIcon("C:/Users/ricol/downloads/batounevaru/batalhanaval/vector-wave-008.jpg"));
				}
   }
}
