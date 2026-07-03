interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser {

    private int age;
    private String bookType;

    public void setAge(int a) {
        age = a;
    }

    public void setBookType(String b) {
        bookType = b;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {

    private int age;
    private String bookType;

    public void setAge(int a) {
        age = a;
    }

    public void setBookType(String b) {
        bookType = b;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("---------- TEST CASE #1: KidUser ----------");

        KidUser kidUser = new KidUser();

        System.out.println("Testing Age = 10:");
        kidUser.setAge(10);
        kidUser.registerAccount();

        System.out.println();

        System.out.println("Testing Age = 18:");
        kidUser.setAge(18);
        kidUser.registerAccount();

        System.out.println();

        System.out.println("Testing BookType = Kids:");
        kidUser.setBookType("Kids");
        kidUser.requestBook();

        System.out.println();

        System.out.println("Testing BookType = Fiction:");
        kidUser.setBookType("Fiction");
        kidUser.requestBook();

        System.out.println("\n---------- TEST CASE #2: AdultUser ----------");

        AdultUser adultUser = new AdultUser();

        System.out.println("Testing Age = 5:");
        adultUser.setAge(5);
        adultUser.registerAccount();

        System.out.println();

        System.out.println("Testing Age = 23:");
        adultUser.setAge(23);
        adultUser.registerAccount();

        System.out.println();

        System.out.println("Testing BookType = Kids:");
        adultUser.setBookType("Kids");
        adultUser.requestBook();

        System.out.println();

        System.out.println("Testing BookType = Fiction:");
        adultUser.setBookType("Fiction");
        adultUser.requestBook();
    }
}