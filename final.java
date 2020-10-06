import java.util.Random; /// რანდომ რიცხვის გენერატორი

public class Final{
  int a, b;

  public Final(int a, int b){
    int amountOfEvens, amountOfOdds, sumOfEvens, sumOfOdds; /// დათვლა და დაჯამება
    amountOfEvens = amountOfOdds = sumOfEvens = sumOfOdds = 0;

    if(b > a){ /// მარჯვნივ იყოს მაღალი რიცხვი
        this.a = a;
        this.b = b;
    } 
    else{
        this.a = b;
        this.b = a;
    }

    for (int i = 0; i < 40; i++){ /// იდეაში, უნდა მოგვცეს 40 რიცხვი
      Random rand;
      int pingu = rand.nextInt((a - b) + 1) + b; /// რანდომი ა და ბ შუალედიდან

      if(pingu % 2 == 0){ /// თუ ლუწია იზრდება ლუწების ოდენობა და ჯამი
          this.amountOfEvens++;
          this.sumOfEvens += pingu;
      } 
      else{
          this.amountOfOdds++;
          this.sumOfOdds += pingu;
      }
    }
  }
}

/// copied from https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java