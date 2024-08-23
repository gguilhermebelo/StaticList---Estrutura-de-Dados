public class Main {
    public static void main(String[] args) {
        StaticList list = new StaticList(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Lista cheia? " + list.isFull());
        System.out.println("Lista vazia? " + list.isEmpty());

        System.out.println("Elemento na posição 2: " + list.getData(2));
        System.out.println("Elemento na posição 4: " + list.getData(4));

        System.out.println("Removendo elemento na posição 1: " + list.remove(1));
        System.out.println("Removendo elemento na posição 2: " + list.remove(2));

        System.out.println("Lista cheia? " + list.isFull());


        list.add(6);
        list.add(7);


        list.setData(8, 0);
        System.out.println("Novo valor na posição 0: " + list.getData(0));

        list.clear();
        System.out.println("Lista limpa");
        System.out.println("Lista vazia? " + list.isEmpty());
    }
}
