class Book {
    private String nameBook;
    private int publicationYear;


    //private String author;
    private final Author author;


    public Book(String namebook, int publicationYear, Author author) {
        this.nameBook = namebook;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

}