package Lessons26;

public enum EnumTask {/*
    Создайте enum `Season`, который включает четыре времени года: `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
    Напишите метод в этом enum, который возвращает рекомендуемую активность для каждого сезона (например, лыжи зимой).*/

    SPRING("Running"),
    SUMMER("Swimming"),
    AUTUMN("bycicle"),
    WINTER("Sky");
    private String activity;
    EnumTask(String activity){
        this.activity = activity;
    }

    public String getDescription(){
        return activity;
    }
}

