package com.decisive.pattern._7_adapter.classAdapter;

public class DuckClassAdpater {
    private DuckAdpater duckAdpater;
    private ChickenAdpater chickenAdpater;

    public DuckClassAdpater() {
        duckAdpater = new DuckAdpater();
        chickenAdpater = new ChickenAdpater();
    }

    public DuckClassAdpater(DuckAdpater duckAdpater) {
        this.duckAdpater = duckAdpater;
        chickenAdpater = new ChickenAdpater();
    }

    public DuckClassAdpater(ChickenAdpater chickenAdpater) {
        duckAdpater = new DuckAdpater();
        this.chickenAdpater = chickenAdpater;
    }


    public DuckClassAdpater(DuckAdpater duckAdpater, ChickenAdpater chickenAdpater) {
        this.duckAdpater = duckAdpater;
        this.chickenAdpater = chickenAdpater;
    }
//    public static void aVoid() {
//        DuckClassAdpater d = null;
//        DuckClassAdpater.ChickenAdpater chickenAdpater = d.new ChickenAdpater();
//    }


    class DuckAdpater extends Duck {
        public void call() {
            chickenAdpater.cry();
        }
    }

    class ChickenAdpater extends Chicken {
//        public void cry() {
//            duckAdpater.call();
//        }
    }

    public DuckAdpater getDuckAdpater() {
        return duckAdpater;
    }

    public ChickenAdpater getChickenAdpater() {
        return chickenAdpater;
    }

}


class Test {

    public static void main(String[] args) {
        DuckClassAdpater duckClassAdpater = new DuckClassAdpater();
        Duck duck = duckClassAdpater.getDuckAdpater();
        duck.call();
        Chicken chicken = duckClassAdpater.getChickenAdpater();
        chicken.cry();

        Chicken chicken1 = new Chicken();

        DuckClassAdpater duckClassAdpater1 = new DuckClassAdpater((DuckClassAdpater.ChickenAdpater) chicken);
        DuckClassAdpater.DuckAdpater duckAdpater = duckClassAdpater1.getDuckAdpater();
        duckAdpater.call();
    }

}
