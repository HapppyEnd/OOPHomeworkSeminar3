import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Создать класс Контейнер - Container.
 * В контейнере могут быть ящики (класс Box).
 * 
 * У каждого ящика есть вес.
 * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков,
 * которые находятся в контейнере.
 * 
 * Класс Контейнер должен быть Comparable. Сравнивать он должен по весам
 * контейнера (чем меньше вес, тем меньше контейнер).
 * Класс ContainerCountComparator - Comparator, который сравнивает контейнеры
 * по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
 * Класс контейнер должен быть Iterable - итерирование должно происходить
 * по ящикам внутри контейнера.
 * Container c = new Container(...);
 * // ...
 * for (Box box: c) {
 * box - это контейнер
 * }
 */

class Homework {

    public static void main(String[] args) {

        Container container1 = new Container();
        for (int i = 0; i < (int) (Math.random() * 20); i++) {
            container1.addBox(new Box());
        }

        Container container2 = new Container();
        for (int i = 0; i < (int) (Math.random() * 20); i++) {
            container2.addBox(new Box());
        }

        Set<Container> containers = new TreeSet<>(
                Arrays.asList(container1, container2));
        for (Container c1 : containers) {
            System.out.println(c1);
        }

        Set<Container> containers2 = new TreeSet<>(
                new ContainerCountComparator());
        containers2.addAll(Arrays.asList(container1, container2));
        for (Container c2 : containers2) {
            System.out.println(c2);
        }

        for (Box box : container1) {
            System.out.println(box);
        }
    }
}
