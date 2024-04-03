
public class Main {
  public static void main(String[] args) {
  //  System.out.println("Hello world!");
// winter, spring, summer, autum
// warm jacket, t-shirt, swimming suite, rain coat

  String season = "qwerty";

      if (season == "winter") {
        System.out.println("Wear a warm jacket!");
      }
      else if (season == "spring") {
        System.out.println("Wear a T-shirt!");
      }
      else if (season == "summer") {
        System.out.println("Wear a swimming suite!");
      }
      else if (season == "autumn") {
        System.out.println("Wear a rain coat!");
      }
        else {
        System.out.println("I do not recognize this season");
  
      }
    // until +5 wear super warm
    // + 5 to +15 warm
    // +15 to +30 normal
    // +30 and more cooling

    double temp = -15.0; //double because 5.1 is already "Warm warm clothes")
    
    if (temp <= 5) {
      System.out.println("Wear super warm clothes!");
    }
    else if (temp <= 15){
      System.out.println("Wear warm clothes!");
    }  
    else if ( temp <= 30) {
      System.out.println("Wear normal clothes!");
    }
    else {
      System.out.println("Wear cool clothes!");
  }


    
  }
}
