
package pilha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class Pilha {  
    private ArrayList<Integer> pilha = new ArrayList();
 int menornum;


    public int getMenornum() {
        return menornum;
    }

    public void setMenornum(int menornum) {
        this.menornum = menornum;
    }
    
void push(int numero){
pilha.add(numero);
}

void pop(){
    if(pilha.isEmpty()){
        System.out.println("Pilha Vazia");
    }
    else{
    pilha.remove(pilha.size()-1);
    }
}

    public ArrayList<Integer> getPilha() {
        return pilha;
    }

    public void setPilha(ArrayList<Integer> pilha) {
        this.pilha = pilha;
    }

void exibir(){
    int i;
    for (i=0; i<pilha.size(); i++) {
        System.out.println(pilha.get(i));
    }
}
		public void min(int menornum){
                for (int i=0; i<pilha.size(); i++) {
			if(i==0){
				setMenornum(pilha.get(i));
			}
			else{
				if(getMenornum() > pilha.get(i)){
					setMenornum(pilha.get(i));	
				}
			}
                 //if(pilha.get(i)==menornum){
		//System.out.println("O menor valor da pilha é :"+pilha.get(i));

    }
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
        while(status!=0){
         Pilha c = new Pilha();
                     
            if (status==1) {
                    System.out.println("Informe um numero para guardar na pilha");
                    int n = ler.nextInt();
                    c.push(n);
                    if(n<c.getMenornum()){
                        c.setMenornum(n);
                    }
               System.out.println("Numero "+n+" registrado");
               System.out.println("Informe (1) para guardar um valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (3) para mostrar a  pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                     status = ler.nextInt();
            }
            else if(status == 2){
                    c.pop();
               System.out.println("Valor removido");
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (3) para mostrar a pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                    status = ler.nextInt();
            }
              else if(status ==3){
                    c.exibir();
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                    status = ler.nextInt();
              }
                else if(status ==4){
                    c.getMenornum();
               System.out.println("O menor valor na pilha é o : "+c.getMenornum());
               System.out.println("Informe (1) para guardar outro valor na pilha");
               System.out.println("Informe (2) para remover o ultimo valor da pilha");
               System.out.println("Informe (3) para mostrar a  pilha");
               System.out.println("Informe (4) para mostrar o menor valor na  pilha");
               System.out.println("Informe (0) para sair");
                  status = ler.nextInt();
                }
                else{
                     System.out.println("Informe um valor entre (0) - (4)");
                     status = ler.nextInt();
            }
        }
        
        System.out.println("Obrigado");
    }






    
}
