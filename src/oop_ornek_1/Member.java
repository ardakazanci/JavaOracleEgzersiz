package oop_ornek_1;

public class Member {

    private String name;
    private String type;
    private int level;
    private int rank;


    // Bu private değişkenlere diğer sınıflardan ulaşabilmek için yapıcı metot tanımlıyoruz.

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getRank() {
        return rank;
    }

    public Member(String name, String type, int level, int rank) {

        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;


    }


}
