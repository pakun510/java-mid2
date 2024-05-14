package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);

        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);


    }

    private static void addFirst(MyList<Integer> list, int size) {
        logic(() -> {
            for (int i = 0; i < size; i++) {
                list.add(0, i);
            }
        }, size);

    }

    private static void addMid(MyList<Integer> list, int size) {
        logic(() -> {
            for (int i = 0; i < size; i++) {
                list.add(i/2, i);
            }
        }, size);
    }

    private static void logic(Logic logic, int size) {
        long startTime = System.currentTimeMillis();
        logic.process();
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
