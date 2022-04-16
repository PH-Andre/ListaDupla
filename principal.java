public class principal {
    public static void main(String[] args) {
        ListasTAD lista = new ListasTAD();

        ListasTAD listaVazia = new ListasTAD();

        lista.insereFinal(10);
        lista.insereFinal(20);
        lista.insereFinal(30);
        lista.insereFinal(40);
        lista.insereFinal(50);
        lista.insereFinal(60);
        lista.insereFinal(70);
        lista.insereFinal(80);
        System.out.println("___________0__________________");
        lista.imprime();
        System.out.println("___________1__________________");
        lista.imprimeReverso();
        System.out.println("___________________________");
        System.out.println(lista.tamanho());
        System.out.println("____________3_________________");
        lista.acessa(2);
        lista.acessa(6);
        System.out.println("____________4_________________");
        System.out.println(lista);


        System.out.println("--------insere inicio-----");
        lista.insereInicio(45);
        System.out.println(lista);
        System.out.println("--------acessa -----");
        lista.acessa(2);
        System.out.println("--------insere -----");
        lista.insere(3, 66);
        System.out.println(lista);
        System.out.println("--------remove final-----");
        listaVazia.insereFinal(50);
        listaVazia.removeFinal();
        listaVazia.removeFinal();

        System.out.println("--------remove inicio-----");
        lista.removeInicio();
        System.out.println(lista);

        System.out.println("--------remove qualquer posição-----");
        lista.remove(3);
        System.out.println(lista);

        System.out.println(lista.pesquisa(80));

        System.out.println("-----------altera---------");
        lista.altera(1, 25);
        lista.altera(3, 25);
        lista.altera(8, 25);

        System.out.println(lista);

        System.out.println(lista.estaVazia());

        lista.limpa();

        System.out.println(lista.estaVazia());




    }
}
