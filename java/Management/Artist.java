package management;

public class Artist {
    private final String nama;
    private final int umur;
    private final String group;

    // Constructor
    public Artist(String name, int age, String group) {
        this.nama = name;
        this.umur = age;
        this.group = group;
    }

    // Getter
    public String getName() {
        return nama;
    }

    public int getAge() {
        return umur;
    }

    public String getGroup() {
        return group;
    }

    // Method untuk menampilkan informasi artis
    public void displayInfo() {
        System.out.println("Name: " + nama);
        System.out.println("Age: " + umur);
        System.out.println("Group: " + group);
    }
}
