import keyword.*; // * importa todos os outros packages do package keyword

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("João");
        System.out.println(client.getName());
        var address = new Address();
        address.setDescription("Rua das Ruas, 123");
        System.out.print(address.getDescription());


    }
}