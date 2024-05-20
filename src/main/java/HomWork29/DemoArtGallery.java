package HomWork29;

public class DemoArtGallery {
    public static void main(String[] args) {
        Painting painting = new Painting("Malevic","Black quadrat", PaintType.ACRYLIC, "150x150" );
        Sculpture sculpture =  new Sculpture("Michelangelo", "David", 300, Material.MARBLE);

        ArtGallery artGallery =  new ArtGallery();
        artGallery.addArtwork(painting);
        artGallery.addArtwork(sculpture);
        artGallery.displayAllArtworks();

        artGallery.removeArtwork(sculpture);

        artGallery.displayAllArtworks();


    }

}
