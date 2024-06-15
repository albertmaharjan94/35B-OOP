public class ConstructorRevise{
    public static void main(String[] args){
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        System.out.println(np.data2);
        ParameterizedConstructor pc = new ParameterizedConstructor(10, "Ram2");
        System.out.println(pc.data2);
        pc.data2 = "Changing";
        // pc.data1 = 100; //
        pc.setData1(100); 
        // System.out.println(pc.data1); // 
        System.out.println(pc.getData1());

        Song s1 = new Song("ABC", 4);
        s1.setId(1);
        s1.setArtists("DJ Khaled");
        s1.description = "Lorem Ipsum ";
        s1.album = "Dollar";
        s1.setDuration(5);
        System.out.println("Song " + s1.getId());
        System.out.println("Title: " + s1.getTitle());
        System.out.println("Duration: " + s1.getDuration());
        System.out.println("Artists: " + s1.getArtists());
        System.out.println("Album: " + s1.album);
        System.out.println("Description: " + s1.description);
    }
}
// Task 
// Make a class Song
// make 4 private property id, title, duration and artists
// make 2 public property album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
// ..
class Song{
    private int id, duration;
    private String title, artists;
    public String album, description;
    Song(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    void setId(int id){
        this.id = id;
    }
    void setDuration(int duration){
        this.duration = duration;
    }
    void setArtists(String artists){
        this.artists = artists;
    }
    int getId(){
        return this.id;
    }
    int getDuration(){
        return this.duration;
    }
    String getTitle(){
        return this.title;
    }
    String getArtists(){
        return this.artists;
    }
}
class ParameterizedConstructor{
    private int data1; // this.data1
    String data2;
    // write only access to private property
    void setData1(int data1){
        this.data1 = data1;
    }
    // read only access to private property
    int getData1(){
        return this.data1;
    }
    ParameterizedConstructor(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }
}

class NonParameterizedConstructor{
    private int data1;
    String data2;
    NonParameterizedConstructor(){
        data1 = 10;
        data2 = "Ram";
        System.out.println("Running in object creation");
    }
}