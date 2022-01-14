import java.util.*;

class Song
{
    private String[] title = new String[20];
    private String[] filename = new String[20];
    private String[] singer = new String[20];
    private Integer[] duration = new Integer[20];
    private Integer[] year = new Integer[20];
    private int pointer = 0;


    Song(String title, String filename, String singer, int duration, int year){
        this.title[0] = title;
        this.filename[0] = filename;
        this.singer[0] = singer;
        this.duration[0] = duration;
        this.year[0] = year;
    }

    String ToString(){
        return String.format("""
                
                ---------------------------------------
                At Position %d
                Song Title: %s
                File Name: %s
                Singer: %s
                Duration: %d seconds
                Year: %d
                ---------------------------------------
                
                """
                ,pointer+1,title[pointer],filename[pointer],singer[pointer],duration[pointer],year[pointer]);
    }

    void InsertSong(String title, String filename, String singer, int duration, int year){
        for(int i = 0; i < 20; i++){
            if(this.title[i] == null){
                this.title[i] = title;
                this.filename[i] = filename;
                this.singer[i] = singer;
                this.duration[i] = duration;
                this.year[i] = year;
                return;
            }
        }
        System.out.println("Maximum number of songs reached, no new song added");
    }

   void SortTitle(){
        boolean sorted = true;
        for(int i = 0; i < 19; i++){
            if(title[i+1] == null && sorted){
                break;
            } else if(title[i+1] == null){
                i = -1;
                sorted = true;
                continue;
            }
            char[] current = title[i].toCharArray();
            char[] next = title[i+1].toCharArray();
            for(int c = 0; c < current.length; c++){
                if (current[c] > next[c]){
                    SwapSong(i, i+1);
                    sorted = false;
                    break;
                } else if(current[c] < next[c]) {
                    break;
                }
            }
        }
       System.out.println("Sorted based on title in ascending order!");
   }

    void SortDuration(){
        boolean sorted = true;
        for(int i = 0; i < 19; i++){
            if(title[i+1] == null && sorted){
                break;
            } else if(title[i+1] == null){
                i = -1;
                sorted = true;
                continue;
            }
            if (duration[i] > duration[i + 1]){
                SwapSong(i, i+1);
                sorted = false;
            }
        }
        System.out.println("Sorted based on duration in ascending order!");
    }

   private void SwapSong(int first, int second){
       Swap(title, first, second);
       Swap(filename, first, second);
       Swap(singer, first, second);
       Swap(duration, first, second);
       Swap(year, first, second);
   }

    private <T> void Swap(T[] t, int first, int second){
        T temp = t[first];
        t[first] = t[second];
        t[second] = temp;
   }

    void Previous(){
        if(pointer != 0){
            pointer--;
        } else{
            for(int i = 0; i < 20; i++){
                if(title[i + 1] == null){
                    pointer = i;
                    return;
                }
            }

        }
    }
    void Next(){
        if(title[pointer + 1] != null || pointer != 19) {
            pointer++;
        } else{
            pointer = 0;
        }
    }
}

class Scratch{
    public static void main(String[] args) {
        Song s = new Song("Marry Had A Little Lamb","littlelamb.mp3","Sarah Josepha Hale",174,1877);
        s.InsertSong("Blinding Lights","blindinglights.mp3","The Weeknd",204,2019);
        s.InsertSong("National Anthem of USSR","ussr.mp3","Basil Poledouris",224,1990);
        s.InsertSong("Never Gonna Give You Up","giveup.mp3","Rick Astley",212,1987);
        System.out.println(s.ToString());
        s.Next();
        System.out.println(s.ToString());
        s.SortTitle();
        System.out.println(s.ToString());
        s.Previous();
        System.out.println(s.ToString());
        s.SortDuration();
        System.out.println(s.ToString());
    }
}

