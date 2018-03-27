import javax.swing.JOptionPane;
public class ListaDeInteiros {
    private int dados[];
    private int tamanho;
    public ListaDeInteiros(int capMax) {
        dados = new int [capMax];
        tamanho = 0;
        System.out.println(capMax);
    }
    /**
     * método que adiciona o novo elemento ao inicio da Lista;
     * @param x 
     */   
    public void adicionaInicio (int x){
        if (tamanho == dados.length-1)    
            {
                JOptionPane.showMessageDialog(null,"ERRO! LISTA CHEIA");
                System.out.println(tamanho);
            }
        else
            {
                for (int i = tamanho;i > 0;i--)
                    {
                        dados[i] = dados[i-1];
                    }
                System.out.println(dados.length);
                System.out.println(tamanho);
                dados[0] = x;
                tamanho++;
            }
    }

    /**
     *
     * @param x
     */
    public void adicionaFinal(int x){
        if (tamanho == dados.length-1)
            {
               JOptionPane.showMessageDialog(null,"ERRO! LISTA CHEIA");
            }
        else 
            {
                dados[tamanho]=x;
                JOptionPane.showMessageDialog(null,"Adicionado com sucesso.");
                tamanho++;
            }   
    }
        public String toString(){
            
            String s = "";
            for (int i=0;i<tamanho;i++){
                s=s+" "+dados[i];
                }
 
            return s;
        }
        public int removeInicio(){
            int r = -1;
            if (tamanho==0){
                JOptionPane.showMessageDialog(null,"Lista Vazia!");}
            else {
                r = dados[0];
                for(int i=1;i<=tamanho-1;i++){
                    dados[i-1]=dados[i];
                    }
                    tamanho--;
                }           
            return r;
        }   
        public int removeFinal(){
            int r = -1;
            if (tamanho==0){
            JOptionPane.showMessageDialog(null,"Lista Vazia!");} 
            else{
                r = dados[tamanho-1];
                dados[tamanho-1] = 0;
                tamanho--;
            }
        return r;  
        }
        public int removePosicao(){
            int r = -1;
            int n;
             if (tamanho==0){
                JOptionPane.showMessageDialog(null,"Lista Vazia!");}
            else {
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser removida;"));
                r = dados[n-1];
                for(int i=n;i<=tamanho-1;i++){
                    dados[i-1]=dados[i];
                    }
                    tamanho--;
                }           
            return r;
        }
        public void primeiroElemento (){
         if(tamanho==0){
             JOptionPane.showMessageDialog(null,"Lista Vazia!");}
         else{
         JOptionPane.showMessageDialog(null,"Primeiro elemento: "+dados[0]);}       
        }
        public void ultimoElemento(){
            if (tamanho==0){
               JOptionPane.showMessageDialog(null,"Lista Vazia!"); }
            else{
                JOptionPane.showMessageDialog(null,"Último elemento: "+dados[tamanho-1]);}      
        }
    }