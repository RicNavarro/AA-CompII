package batalhanaval;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.Random;

public class BatalhaNaval extends JFrame implements ActionListener
{ 
   private JButton table[][];
   private boolean tablejafoiclicado[][];
   private int tablequalunidade[][];
   private JButton teste[][];
   private boolean testejafoiclicado[][];
   private int testequalunidade[][];
   
   private int aleatorio1;
   private int aleatorio2;
   
   private ImageIcon sub = new ImageIcon("./submarino.png"); // Imagem do submarino
   private JButton botaoS = new JButton(sub); //Botao do tiro submarino
   
   private ImageIcon jat = new ImageIcon("./jato.png");//Imagem do Jato
   private JButton botaoJ = new JButton(jat); //Botao do tiro Jato
   
   private ImageIcon esc = new ImageIcon("./escolta.png"); //Imagem do Navio de escolta
   private JButton botaoE = new JButton(esc); //Botao do tiro do Navio de escolta
   
   private ImageIcon porta = new ImageIcon("./portaavioes.png");//Imagem do porta avioes
   private JButton botaoP = new JButton(porta); //Botao do tiro porta-avioes

   public BatalhaNaval()
   {
       super("Batalha Naval"); //Nome da janela
       setSize(1100,700); //Resolucao
       setResizable(false); //Nao pode diminuir ou aumentar a tela
       setDefaultCloseOperation(EXIT_ON_CLOSE);//Para de rodar quando fecha a janela
       
       criarGrade(); //Cria o jogo
       setVisible(true); //Deixa a janela visivel
   } 
   private void criarGrade(){
       
       
       ImageIcon icone = new ImageIcon("./vector-wave-009.jpg"); //Icone dos butoes
       JPanel grade = new JPanel(); 
       grade.setBackground(Color.white);//Setando o pano de fundo com a cor branca
       grade.setLayout(new GridLayout(22,12));//Tamanho do Grid Layout (mod)
       grade.setPreferredSize(new Dimension(100,23)); //faz merda nenhuma
             
       table = new JButton[10][10]; //Matriz do jogador
       teste = new JButton[10][10]; //Matriz do PC
       tablejafoiclicado = new boolean[10][10];//Matriz que verifica se um espaÃ§o do grid do jogador ja foi clicado
       testejafoiclicado = new boolean[10][10];//Matriz que verifica se um espaÃ§o do grid do PC ja foi clicado
       tablequalunidade = new int[10][10];//Matriz que indica qual unidade estÃ¡ em qual espaÃ§o do jogador
       testequalunidade = new int[10][10];//Matriz que indica qual unidade estÃ¡ em qual espaÃ§o do PC
       
       for(int i = 0; i < 10; i++) //Preenche matriz de botoes
       {
           for(int j = 0; j < 10; j++)
           {        
              table[i][j] = new JButton(icone);  
              table[i][j].setSize(new Dimension(328,328));
              table[i][j].addActionListener(this);
              tablequalunidade[i][j] = 0;
              //tablejafoiclicado[i][j] = false;
           }
       }
       
       for(int i = 0; i < 10; i++)//Preenche matriz de botoes
       {
           for(int j = 0; j < 10; j++)
           {
            teste[i][j] = new JButton(icone);
            teste[i][j].setPreferredSize(new Dimension(328,328));
            teste[i][j].addActionListener(this);
            testequalunidade[i][j] = 0;
            //testejafoiclicado[i][j] = false;
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
        ImageIcon bg = new ImageIcon("./bg.png");         
        JLabel animegirl = new JLabel(bg); 
        animegirl.setBackground(Color.white);
        
        this.getContentPane().add(animegirl, BorderLayout.WEST);  
        
        //Bottom:
        
        //Tiro Submarino:
        botaoS.setBackground(Color.white);
        Submarino1 s1 = new Submarino1();//Celula1
        Submarino2 s2 = new Submarino2();//Celula2
        do {
	        Random geradordealeatorio1sub = new Random();
	        setAleatorio1(geradordealeatorio1sub.nextInt(10));        
	        Random geradordealeatorio2sub = new Random();
	        setAleatorio2(geradordealeatorio2sub.nextInt(10));
	        
	        //coloca o submarino no jogador
	        if(aleatorio2 == 9) {
	     	   aleatorio2--;
	        }
	        if(testequalunidade[aleatorio1][aleatorio2] == 0) {
	        	testequalunidade[aleatorio1][aleatorio2] = 11;
	        	testequalunidade[aleatorio1][aleatorio2+1] = 12;
	        	System.out.println("Submarino começa na posição: "+aleatorio1+"/"+aleatorio2);
	        }	
        }while(testequalunidade[aleatorio1][aleatorio2]==0);
        
        //Logica para setar vivo ou morto
        TiroSub s = new TiroSub(s1, s2); 
        boolean sbool = s.getPermissaoparaatirar(); 
        if(sbool == true)
        {
            botaoS.addActionListener(this);
        }
        else
        {
            botaoS.setBackground(Color.red);
        }
        
        //Jato
        botaoJ.setBackground(Color.white);
        Jato1 j1 = new Jato1(); 
        Jato2 j2 = new Jato2(); 
        do {
	        Random geradordealeatorio1jato = new Random();
	        setAleatorio1(geradordealeatorio1jato.nextInt(10));        
	        Random geradordealeatorio2jato = new Random();
	        setAleatorio2(geradordealeatorio2jato.nextInt(10));
	        
	        //coloca o jato no jogador
	        if(aleatorio2 == 9) {
	     	   aleatorio2--;
	        }
	        if(tablequalunidade[aleatorio1][aleatorio2] == 0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13)) {
	        	testequalunidade[aleatorio1][aleatorio2] = 21;
	        	testequalunidade[aleatorio1][aleatorio2+1] = 22;
	        	System.out.println("Jato começa na posição: "+aleatorio1+"/"+aleatorio2);
	        }	
        }while(testequalunidade[aleatorio1][aleatorio2]==0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13));
        
        //Logica para setar vivo ou morto
        TiroJat j = new TiroJat(j1, j2);
        boolean jbool = j.getPermissaoparaatirar();
        if(jbool == true)
        {
            botaoJ.addActionListener(this); 
        }
        else
        {
            botaoJ.setBackground(Color.red);
        }
        
        //Navio de Escolta
        botaoE.setBackground(Color.white);
        Escolta1 e1 = new Escolta1();
        Escolta2 e2 = new Escolta2();
        Escolta3 e3 = new Escolta3();
        do {
	        Random geradordealeatorio1escolta = new Random();
	        setAleatorio1(geradordealeatorio1escolta.nextInt(10));        
	        Random geradordealeatorio2escolta = new Random();
	        setAleatorio2(geradordealeatorio2escolta.nextInt(10));
	        
	        //coloca o navio de escolta no jogador
	        if(aleatorio2 == 9){
	        	aleatorio2 = aleatorio2 - 2;
	        }
	        if(aleatorio2 == 8) {
	        	aleatorio2--;
	        }
	        if(tablequalunidade[aleatorio1][aleatorio2] == 0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13) || (tablequalunidade[aleatorio1][aleatorio2]>20 && tablequalunidade[aleatorio1][aleatorio2]<23)) {
	        	testequalunidade[aleatorio1][aleatorio2] = 31;
	        	testequalunidade[aleatorio1][aleatorio2+1] = 32;
	        	testequalunidade[aleatorio1][aleatorio2+2] = 33;
	        	System.out.println("Escolta começa na posição: "+aleatorio1+"/"+aleatorio2);
	        }	
        }while(testequalunidade[aleatorio1][aleatorio2]==0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13) || (tablequalunidade[aleatorio1][aleatorio2]>20 && tablequalunidade[aleatorio1][aleatorio2]<23));
        
        //Logica para setar vivo ou morto
        TiroEsc e = new TiroEsc(e1, e2, e3);
        boolean ebool = e.getPermissaoparaatirar();
        if(ebool == true)
        {
           botaoE.addActionListener(this);
        }
        else
        {
            botaoE.setBackground(Color.red);
        }
        
        //Porta-avioes
        botaoP.setBackground(Color.white);
        Porta1 p1 = new Porta1(); //Celula1
        Porta2 p2 = new Porta2(); //Celula2
        Porta3 p3 = new Porta3(); //Celula3
        Porta4 p4 = new Porta4(); //Celula4
        do {
	        Random geradordealeatorio1porta = new Random();
	        setAleatorio1(geradordealeatorio1porta.nextInt(10));        
	        Random geradordealeatorio2porta = new Random();
	        setAleatorio2(geradordealeatorio2porta.nextInt(10));
	        
	        //coloca o submarino no jogador
	        if(aleatorio2 == 9){
	        	aleatorio2 = aleatorio2 - 3;
	        }
	        if(aleatorio2 == 8) {
	        	aleatorio2 = aleatorio2 - 2;
	        }
	        
	        if(aleatorio2 == 7) {
	        	aleatorio2--;
	        }
	        if(tablequalunidade[aleatorio1][aleatorio2] == 0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13) || (tablequalunidade[aleatorio1][aleatorio2]>20 && tablequalunidade[aleatorio1][aleatorio2]<23 || (tablequalunidade[aleatorio1][aleatorio2]>30 && tablequalunidade[aleatorio1][aleatorio2]<34))) {
	        	testequalunidade[aleatorio1][aleatorio2] = 41;
	        	testequalunidade[aleatorio1][aleatorio2+1] = 42;
	        	testequalunidade[aleatorio1][aleatorio2+2] = 43;
	        	testequalunidade[aleatorio1][aleatorio2+3] = 44;
	        	System.out.println("Porta avioes começa na posição: "+aleatorio1+"/"+aleatorio2);
	        }	
        }while(testequalunidade[aleatorio1][aleatorio2]==0 || (tablequalunidade[aleatorio1][aleatorio2]>10 && tablequalunidade[aleatorio1][aleatorio2]<13) || (tablequalunidade[aleatorio1][aleatorio2]>20 && tablequalunidade[aleatorio1][aleatorio2]<23 || (tablequalunidade[aleatorio1][aleatorio2]>30 && tablequalunidade[aleatorio1][aleatorio2]<34)));
        boolean pbool = true;
        if(p1.getVivo() == false && p2.getVivo() == false && p3.getVivo() == false && p4.getVivo() == false)
        {
        	botaoP.setBackground(Color.red);     
        	pbool = false;
        }else {
        	botaoP.addActionListener(this);
        }
        
        
        JPanel navios = new JPanel();
        navios.setLayout(new GridLayout(1,1));
        navios.add(botaoS);
        navios.add(botaoJ);
        navios.add(botaoE);
        navios.add(botaoP);
        
        if(pbool == false && ebool == false && jbool == false && sbool == false)
        {
            Lose perdeu = new Lose(this);
        }
   
        this.getContentPane().add(navios, BorderLayout.SOUTH);
   }
   
   //@Override
   public void actionPerformed(ActionEvent e){ //Esse soh o pc tem acesso
	   
       Object object = e.getSource();
       
       
	for(int i = 0; i<10 ; i++)
        {
            for(int j = 0; j<10 ; j++)
            {
            	if(object == teste[i][j] && testequalunidade[i][j] != 0) {
            		if(testequalunidade[i][j] == 11)
            			teste[i][j].setIcon(new ImageIcon("./sub1.jpg"));
            		if(testequalunidade[i][j] == 12)
            			teste[i][j].setIcon(new ImageIcon("./sub2.jpg"));
            		if(testequalunidade[i][j] == 21)
            			teste[i][j].setIcon(new ImageIcon("./jato1.jpg"));
            		if(testequalunidade[i][j] == 22)
            			teste[i][j].setIcon(new ImageIcon("./jato2.jpg"));
            		if(testequalunidade[i][j] == 31)
            			teste[i][j].setIcon(new ImageIcon("./esc1.jpg"));
            		if(testequalunidade[i][j] == 32)
            			teste[i][j].setIcon(new ImageIcon("./esc2.jpg"));
            		if(testequalunidade[i][j] == 33)
            			teste[i][j].setIcon(new ImageIcon("./esc3.jpg"));
            		if(testequalunidade[i][j] == 41)
            			teste[i][j].setIcon(new ImageIcon("./port1.jpg"));
            		if(testequalunidade[i][j] == 42)
            			teste[i][j].setIcon(new ImageIcon("./port2.jpg"));
            		if(testequalunidade[i][j] == 43)
            			teste[i][j].setIcon(new ImageIcon("./port3.jpg"));
            		if(testequalunidade[i][j] == 44)
            			teste[i][j].setIcon(new ImageIcon("./port4.jpg"));
            	}else
                if (object == teste[i][j])
                {
                    teste[i][j].setIcon(new ImageIcon("./vector-wave-008.jpg"));
                }
            }
        }
        
        if(object == botaoS)
        {
            botaoS.setIcon(new ImageIcon("./subclick.png"));
            botaoJ.setIcon(new ImageIcon("./jato.png"));
            botaoE.setIcon(new ImageIcon("./escolta.png"));
        }
        if(object == botaoJ)
        {
            botaoJ.setIcon(new ImageIcon("./jatclick.png"));
            botaoE.setIcon(new ImageIcon("./escolta.png"));
            botaoS.setIcon(new ImageIcon("./submarino.png"));
        }
        if(object == botaoE)
        {
            botaoE.setIcon(new ImageIcon("./escclick.png"));
            botaoJ.setIcon(new ImageIcon("./jato.png"));
            botaoS.setIcon(new ImageIcon("./submarino.png"));
        }
        
        if(object == botaoP)
        {
            botaoE.setIcon(new ImageIcon("./escolta.png"));
            botaoJ.setIcon(new ImageIcon("./jato.png"));
            botaoS.setIcon(new ImageIcon("./submarino.png"));
        }

   }
   
   public int getAleatorio1() {
	   return this.aleatorio1;
   }
   public int getAleatorio2() {
	   return this.aleatorio2;
   }
   public void setAleatorio1(int a) {
	   this.aleatorio1 = a;
   }
   public void setAleatorio2(int a) {
	   this.aleatorio2 = a;
   }
}
