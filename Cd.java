class Cd {
  public String mArtistName;
  public String mAlbumName;
  public int mReleaseYear;
  public int mPrice;



//creating a constructor
public Cd(String artistName, String albumName, int releaseYear, int price) {
  mArtistName = artistName;
  mAlbumName = albumName;
  mReleaseYear = releaseYear;
  mPrice = price;
}

//creating a method to search by release year
  public boolean searchYear(int year) {
    return mReleaseYear == year;
  }


//creating a method to search by price
public boolean searchPrice(int minPrice, int maxPrice ) {
  return ((mPrice >= minPrice) && (mPrice <= maxPrice));
}
}
