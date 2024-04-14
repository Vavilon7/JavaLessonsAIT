package Lessons26;

public enum Season { /*
    Создайте enum `Season`,
    который включает четыре времени года:
    `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
    Напишите метод в этом enum,
    который возвращает рекомендуемую
    активность для каждого сезона
    (например, лыжи зимой).
     */

    /*
    Используя созданный enum `Season`,
    напишите метод,
    который принимает значение `Season`
    и выводит сообщение о том,
    как одеваться в этот сезон,
    используя конструкцию `switch`.
     */
    SPRING("Running"),
    SUMMER("Swimming"),
    AUTUMN("bycicle"),
    WINTER("Sky");
    private String activity;
    Season(String activity){
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }
}

