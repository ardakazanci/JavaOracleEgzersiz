package getter_setter_ornek;

public class Ornek2 {

    private String name;

    public String getName() {

        if (name.length() > 10) {

            return "10 karakterden uzun String ifade giremezsiniz";


        } else {

            return this.name;

        }


    }


    public void setName(String name) {

        this.name = name;

    }

}
