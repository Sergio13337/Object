public class App {


    public static void main(String[] args) {

        literaryWork nameAndLitAndYear = new literaryWork();
        nameAndLitAndYear.name = "Boris Pasternak - Doctor Jivago";
        nameAndLitAndYear.yearOfWriting = 1955;
        nameAndLitAndYear.name2 = "Alexandr Griboedov - Gore ot uma";
        nameAndLitAndYear.yearOfWriting2 = 1825;
        System.out.println("nameAndLitAndYear.name = " + nameAndLitAndYear.name + " " + nameAndLitAndYear.getYearOfWriting());
        nameAndLitAndYear.setYearOfWriting(1956);
        System.out.println("nameAndLitAndYear.getYearOfWriting() = " + nameAndLitAndYear.getYearOfWriting());
        System.out.println("nameAndLitAndYear.name = " + nameAndLitAndYear.name2 + " " + nameAndLitAndYear.yearOfWriting2);


    }


    public static class literaryWork {
        private String name;
        private String name2;
        private int yearOfWriting;
        private int yearOfWriting2;

        public int getYearOfWriting() {
            return this.yearOfWriting;
        }

        public void setYearOfWriting(int yearOfWriting) {
            this.yearOfWriting = yearOfWriting;
        }
    }
}
