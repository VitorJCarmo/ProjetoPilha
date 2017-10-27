
package pilha;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Pilha {  
    private ArrayList<Integer> pilha = new ArrayList();
    int tam;
        public Pilha() {
this.tam = pilha.size();
    }
    
void push(int numero){
this.pilha.add(numero);
}

void pop(){
pilha.remove(tam);
}

    public ArrayList<Integer> getPilha() {
        return pilha;
    }

    public void setPilha(ArrayList<Integer> pilha) {
        this.pilha = pilha;
    }

void exibir(){
    int i;
    for (i=0; i<=pilha.size(); i++) {
        System.out.println(pilha.get(i));
    }
		
}
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
               System.out.println("Informe (1) para guardar um valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (3) para mostrar a  pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
           int status = ler.nextInt();
         Pilha c = new Pilha();
        while(status!=0){

             
                     
            switch (status) {
                case 1:
                    System.out.println("Informe um numero para guardar na pilha");
                    int n = ler.nextInt();
                    c.push(n);
               System.out.println("Numero "+n+" registrado");
               System.out.println("Informe (1) para guardar um valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (3) para mostrar a  pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                     status = ler.nextInt();
                    break;
                case 2:
                    c.pop();
               System.out.println("Valor removido");
                  c.exibir();
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                    status = ler.nextInt();
                    break;
                case 3:
                    c.exibir();
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                    status = ler.nextInt();
                    break;
                case 4:
                    c.exibir();
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (3) para mostrar a  pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                  status = ler.nextInt();
                    break;
                default:
                    
                    break;
            }
        }
        
        System.out.println("Obrigado");
    }






    
}
