package lista1;



import javax.swing.JOptionPane;

public class Main {
	public static void main (String arg[]){
		ListaLigada lista2 = new ListaLigada();
        int op=0 ;
            while (op!=100){
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu "
            		+ "\n1-Adiciona Inicio"
                    + "\n2-Adiciona Final"
                    + "\n3-Adiciona em Posição"
                    + "\n4-Remove Inicio"
                    + "\n5-Remove Final"
                    + "\n6-Remove Posição"
                    + "\n7-Primeiro Elemento"
                    + "\n8-Último Elemento"
                    + "\n9-Todos Elementos"
                    + "\n100-Sair"));
                switch (op){
                    case 1: 
                        lista2.adicionaInicio(Integer.parseInt(JOptionPane.showInputDialog("Value?")));
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;
                    case 3: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;    
                    case 4: 
                        JOptionPane.showMessageDialog(null,"Removido: "+lista2.removeInicio());
                        break;
                    case 5: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;
                    case 6: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;
                    case 7: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;
                    case 8: 
                        JOptionPane.showMessageDialog(null,"Implementation");
                        break;
                    case 9: 
                        JOptionPane.showMessageDialog(null,lista2.toString());
                        break;    
                    case 100: 
                     JOptionPane.showMessageDialog(null,"Até mais");
                        break;        
                    default :
                     JOptionPane.showMessageDialog(null,"Valor Inválido");
            }    
        }
      System.exit(0);
    }
}
