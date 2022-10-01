public class Author {
    private String nameAuthor;
    private String surname;

    public Author(String name, String surname) {
        this.nameAuthor = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return
                nameAuthor + " " + surname;


    }


    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surname;
    }
}
