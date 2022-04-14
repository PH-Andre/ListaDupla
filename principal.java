public class principal {
    public static void main(String[] args) {
        ListasTAD lista = new ListasTAD();

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
        System.out.println("____________2_________________");
        System.out.println(lista.tamanho());
        System.out.println("____________3_________________");
        lista.acessa(2);
        lista.acessa(6);
        System.out.println("____________4_________________");
        System.out.println(lista);

    }
}
