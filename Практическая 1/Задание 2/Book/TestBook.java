package com.company;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Книга, созданная конструктором по умолчанию:");
        System.out.println(b1);
        Book b2 = new Book("Война и мир", "Лев Николаевич Толстой");
        System.out.println("Книга, созданная конструктором с частичной инициализацией:");
        System.out.println(b2);
        System.out.println("Книга, созданная консруктором со всеми полями:");
        try{
            System.out.println("Попытка изменить количество экземпляров на отрицательное число:");
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
        System.out.println("Изменение количества экземпляров на 0:");
        System.out.println("Изменение количества экземпляров на 100:");
    }
}
