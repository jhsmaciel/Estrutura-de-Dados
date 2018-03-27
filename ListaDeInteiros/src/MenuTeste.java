/**
 *
 * @author Joao Henrique
 * @date 05/03/2018
 */
import javax.swing.JOptionPane;
public class MenuTeste {
    public static void main (String arg[]){
        ListaDeInteiros lista1 = new ListaDeInteiros(4);
        int op=0,x ;
        String str;
            while (op!=100){
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu \n"+
                    "1-Adiciona Início\n2-Adiciona Final\n3-Adiciona em Posição\n4-Remove Início\n5-Remove Final\n6-Remove Posição\n7-Primeiro Elemento\n8-Último Elemento\n9-Todos Elementos\n100-Sair"));
                switch (op){
                    case 1: 
                        x = Integer.parseInt(JOptionPane.showInputDialog("Value Inicio?"));
                        lista1.adicionaInicio(x);
                        break;
                    case 2: 
                        x = Integer.parseInt(JOptionPane.showInputDialog("Value Final?"));
                        lista1.adicionaFinal(x);
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
