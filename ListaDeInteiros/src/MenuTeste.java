/**
 *
 * @author Joao Henrique
 * @date 05/03/2018
 */
import javax.swing.JOptionPane;
public class MenuTeste {
    public static void main (String arg[]){
        ListaDeInteiros lista1 = new ListaDeInteiros(4);
        int op=0 ;
            while (op!=10){
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu \n"
            		+"1-Adiciona Inicio\n"
                    + "2-Adiciona Final\n"
                    + "3-Adiciona em Posição\n"
                    + "4-Remove Inicio\n"
                    + "5-Remove Final\n"
                    + "6-Remove Posição\n"
                    + "7-Primeiro Elemento\n"
                    + "8-Último Elemento\n"
                    + "9-Todos Elementos\n"
                    + "10-Sair"));
                switch (op){
                    case 1: 
                        lista1.adicionaInicio(Integer.parseInt(JOptionPane.showInputDialog("Value Inicio?")));
                        break;
                    case 2: 
                    	lista1.adicionaFinal(Integer.parseInt(JOptionPane.showInputDialog("Value Final?")));
                        break;
                    case 3: 
                        JOptionPane.showMessageDialog(null,"Removido: ");
                        break;    
                    case 4: 
                        JOptionPane.showMessageDialog(null,"Removido: "+lista1.removeInicio());
                        break;
                    case 5: 
                        JOptionPane.showMessageDialog(null,"Removido"+lista1.removeFinal());
                        break;
                    case 6: 
                        JOptionPane.showMessageDialog(null,"Removido: "+lista1.removePosicao());
                        break;
                    case 7: 
                        lista1.primeiroElemento();
                        break;
                    case 8: 
                        lista1.ultimoElemento();
                        break;
                    case 9: 
                        JOptionPane.showMessageDialog(null,lista1.toString());
                        break;    
                    case 100: 
                     JOptionPane.showMessageDialog(null,"Até mais");
                        break;        
                    default :
                     JOptionPane.showMessageDialog(null,"Valor Inválido.");
            }    
        }
      System.exit(0);
    }
}
