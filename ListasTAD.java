public class ListasTAD {
    private Nodo inicio, fim;
    private int num;

    public ListasTAD(){
        this.inicio = null;
        this.fim = null;
        this.num = 0;
    }

    public boolean estaVazia(){
        if (this.num == 0){
            return true;
        }else {
            return false;
        }
    }

    public int tamanho() {
        return this.num;
    }

    public void imprime() {
        Nodo atual = this.inicio;
        for (int i = this.num-1 ; i >= 0; i--){
            System.out.println(atual);
            atual = atual.prox;
        }
    }

    public void imprimeReverso() {
        Nodo atual = this.fim;
        for (int i = this.num-1 ; i >= 0; i--){
            System.out.println(atual);
            atual = atual.ant;
        }
    }

    public int acessa(int pos) {
        Nodo atual;
        if (pos > this.num/2){
            atual = this.fim;
            for (int i = this.num-pos-1 ; i >= 0; i--){
                atual = atual.ant;
            }

        }else{
            atual = this.inicio;
            for (int i = pos-1 ; i > 0; i--){
                atual = atual.prox;
            }
        }
        System.out.println(atual);
        return atual.elem;
    }

    public void insere(int pos, int valor) {
        Nodo novo = new Nodo(valor);
        novo.elem = valor;
        Nodo atual;
        if (pos > this.num/2){
            atual = this.fim;
            for (int i = this.num-pos-1 ; i >= 0; i--){
                atual = atual.ant;
            }

        }else{
            atual = this.inicio;
            for (int i = pos-1 ; i > 0; i--){
                atual = atual.prox;
            }
        }
        novo.prox = atual;
        novo.ant = atual.ant;
        atual.ant = novo;
        atual = novo.ant;
        atual.prox = novo;

        this.num += 1;

    }

    public void insereFinal(int valor){
        Nodo novo = new Nodo(valor);
        novo.elem = valor;

        if (this.estaVazia()) {
            novo.ant = null;
            novo.prox = null;
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.prox = novo;
            novo.prox = null;
            novo.ant = fim;
            this.fim = novo;
        }

        this.num += 1;

    }

    public void  removeFinal(){
        if (this.num >0) {
            if (this.num == 1) {
                this.fim = null;
                this.inicio = null;
            } else {
                this.fim = this.fim.ant;
                this.fim.prox = null;
            }
            this.num -= 1;
            System.out.println("Elemento removido com sucesso");
        }else {
            System.out.println("Lista j?? esta vazia");}
        }

    public void removeInicio() {
        if (this.num >0) {

            this.inicio = this.inicio.prox;
            this.inicio.ant = null;
            this.num -= 1;
            System.out.println("Elemento removido com sucesso");
        }else {
            System.out.println("Lista j?? esta vazia");}
    }

    public void remove(int pos) {
        Nodo atual;
        Nodo atual2;
        if (this.num >0) {
            if (pos > this.num/2){
                atual = this.fim;
                for (int i = this.num-pos-1 ; i >= 0; i--){
                    atual = atual.ant;
                }

            }else{
                atual = this.inicio;
                for (int i = pos-1 ; i > 0; i--){
                    atual = atual.prox;
                }
            }
            atual2 = atual.ant;
            atual = atual.prox;
            atual.ant = atual2;
            atual2.prox = atual;
            this.num -= 1;
            System.out.println("Elemento removido com sucesso");
        }else {
            System.out.println("Lista j?? esta vazia");}
    }

    public boolean pesquisa(int valor) {
        Nodo atual = this.inicio;


        for (int i = 0 ; i <= this.num-1 ; i++){

            if(atual.elem == valor) {
                return true;
            }
            atual = atual.prox;


        }
        return false;

    }

    public void altera(int pos, int valor) {
        Nodo atual;
        if (pos > this.num/2){
            atual = this.fim;
            for (int i = this.num-pos-1 ; i >= 0; i--){
                atual = atual.ant;
            }

        }else{
            atual = this.inicio;
            for (int i = pos-1 ; i > 0; i--){
                atual = atual.prox;
            }
        }
        atual.elem = valor;


    }







    public void insereInicio(int valor) {
        Nodo novo = new Nodo(valor);
        novo.elem = valor;

        if (this.estaVazia()) {
            novo.ant = null;
            novo.prox = null;
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.inicio.ant = novo;
            novo.prox = inicio;
            novo.ant = null;
            this.inicio = novo;
        }

        this.num += 1;

    }

    public void limpa(){
        this.inicio = null;
        this.fim = null;
        this.num = 0;
    }



    @Override
    public String toString() {
        System.out.println("elementos");
        Nodo aux = this.inicio;
        for (int i = 0; i < this.num ; i++) {
            System.out.println(aux);
            aux = aux.prox;
        }
        return "numemro elementos: " + this.num;
    }


}
