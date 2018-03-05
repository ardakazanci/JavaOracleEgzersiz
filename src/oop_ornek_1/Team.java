package oop_ornek_1;

public class Team {

    Member member;

    // Yapıcı Metot : Member sınıf referansı oluşturuyoruz ve o referans a eşitliyoruz.

    public Team(Member member) {

        this.member = member;

    }


    public static void main(String[] args) {

        Member member1 = new Member("Arda", "light", 10, 1);
        Team myTeam = new Team(member1);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());


    }


}
