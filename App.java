// Create a command line interface application for a music store that sells CDs. The application should use a while loop to continually run until the user opts to exit. (As seen in this lesson.) Users should be able to:
//
// Create a new CD object by providing an artist name, album name, release year, and price.
// See a list of all CDs currently in the store's inventory.
// Search for CDs based on their release year.
// Search based on price range.
// Search based on artist.

import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
  Console myConsole = System.console();
//creating objects for class Cd
  Cd pop = new Cd("Michael Jackson", "Thriller", 1985, 10);
  Cd classical = new Cd("Rahman", "Melody", 1990, 20);
  Cd country = new Cd("Gaspar Pants", "Children's Music", 2005, 40);
//creating ArrayList
  List<Cd> allCds = new ArrayList<Cd>();
//adding objects(items) to ArrayList
  allCds.add(pop);
  allCds.add(classical);
  allCds.add(country);

  System.out.println("Welcome to our CD Store. Choose one, please. See all CDs, Search by release year, Search by price, Search by artist.");
  String choice = myConsole.readLine();

  if (choice.equals("See all CDs")) {
    for (Cd individualCd : allCds) {
      System.out.println("----------");
      System.out.println( individualCd.mArtistName );
      System.out.println( individualCd.mAlbumName );
      System.out.println( individualCd.mReleaseYear );
      System.out.println( individualCd.mPrice );
    }
    } else if (choice.equals("Search by release year")) {
      System.out.println("Enter the release year");
      int userYear = Integer.parseInt(myConsole.readLine());
      for (Cd individualCd : allCds) {
        if (individualCd.searchYear(userYear)) {
          System.out.println( individualCd.mArtistName );
          System.out.println( individualCd.mAlbumName );
          System.out.println( individualCd.mReleaseYear );
          System.out.println( individualCd.mPrice );
        }
      }
    } else if (choice.equals("Search by price")) {
      System.out.println("Enter the minimum price");
      int userMinPrice = Integer.parseInt(myConsole.readLine());
      System.out.println("Enter the maximum price");
      int userMaxPrice = Integer.parseInt(myConsole.readLine());
      for (Cd individualCd : allCds) {
        if (individualCd.searchPrice(userMinPrice, userMaxPrice)) {
          System.out.println( individualCd.mArtistName );
          System.out.println( individualCd.mAlbumName );
          System.out.println( individualCd.mReleaseYear );
          System.out.println( individualCd.mPrice );
        }
      }




    } else {
      System.out.println( "o" );
    }
  }
}
