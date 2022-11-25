package laba1;

public class Pear extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;

    public Pear(String size) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Pear");
        // Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " eaten ");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Pear)) return false; // Шаг 2
            return size.equals(((Pear)arg0).size); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
    // название продукта, но и его размер
    public String toString() {
        return super.toString() + " size " + size.toUpperCase() + " ";
    }
}