package structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Comedy");
        movie.setTitle("American pie");
        movie.setRuntime("1:35");
        movie.setYear("2003");
        
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        
        Formatter htmlFormatter = new HTMLFormatter();
        
        String printerMaterial = moviePrinter.print(printFormatter);
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printerMaterial);
        System.out.println(htmlMaterial);
    }
}
